package com.ugdao.ugdao.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.ugdao.ugdao.Contant.Contants;
import com.ugdao.ugdao.R;
import com.ugdao.ugdao.bean.LoginBean;
import com.ugdao.ugdao.utils.PreferenceUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Response;

public class LoginActivity extends BaseActivity {


    @BindView(R.id.iv_title)
    ImageView ivTitle;
    @BindView(R.id.et_nmb)
    EditText etNmb;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.ll_et)
    LinearLayout llEt;
    //    @BindView(R.id.cb_RLogin)
    CheckBox cbRLogin;
    //    @BindView(R.id.cb_save)
    CheckBox cbSave;
    @BindView(R.id.rl_cb)
    RelativeLayout rlCb;
    @BindView(R.id.cb_protocol)
    CheckBox cbProtocol;
    @BindView(R.id.ll_protocol)
    LinearLayout llProtocol;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_userprotocol)
    TextView tvUserprotocol;
    @BindView(R.id.tv_protactprotocol)
    TextView tvProtactprotocol;
    @BindView(R.id.tv_totaltitle)
    TextView tvTotaltitle;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.lv_map)
    ImageView lvMap;
    @BindView(R.id.pb)
    ProgressBar pb;
    private String password;
    private String number;
    private String deviceId;
    private LoginBean loginBean;
    private Integer o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        tvTotaltitle.setText("用户登录");
        tvTotaltitle.setTextSize(18);
        tvTotaltitle.setTextColor(Color.WHITE);
        echoPhone();
        //设备Id
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        //手机的id
        deviceId = ((TelephonyManager) getSystemService(TELEPHONY_SERVICE)).getDeviceId();


        FragmentManager supportFragmentManager = getSupportFragmentManager();

//        Glide


    }

    /**
     * 回显手机号
     */
    private void echoPhone() {
        String phone = PreferenceUtils.getString(this, "phone", "");
        if (!phone.equals("")) {
            etNmb.setText(phone);
        }

    }

    @OnClick({R.id.cb_protocol, R.id.btn_login,
            R.id.tv_userprotocol, R.id.tv_protactprotocol,
            R.id.tv_totaltitle, R.id.iv_back})
    public void onViewClicked(View view) {

        switch (view.getId()) {
//            case R.id.cb_RLogin:
//                Toast.makeText(this, "自动登陆设置完毕", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.cb_save:
//
//                Toast.makeText(this, "密码以保存", Toast.LENGTH_SHORT).show();
//                break;
            case R.id.cb_protocol:
//                Toast.makeText(this, "隐私协议cb被点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_login:
                //判断协议是否已经选中

//                List<Integer> list = new ArrayList();
//                list.add(1);
//
//                for (int i = 0; i < list.size(); i++) {
//                    o = list.get(0);
//                }
//
//                o = null;
//                int i = 1 / o;


                if (cbProtocol.isChecked()) {
                    login();
                } else {
                    Toast.makeText(this, "请确认是否已经阅读协议", Toast.LENGTH_SHORT).show();
                }


                break;

            case R.id.tv_userprotocol:
                //用户协议界面
                Intent intent = new Intent(LoginActivity.this, UserProtocolActivity.class);
                startActivity(intent);
                break;

            case R.id.tv_protactprotocol:
                //隐私协议
                Intent intentProtact = new Intent(LoginActivity.this, ProtactProtocolActivity.class);
                startActivity(intentProtact);
                break;

            case R.id.tv_totaltitle:
                //设置标题

                break;
            case R.id.iv_back:
//                Toast.makeText(this, "退出按钮被点击了", Toast.LENGTH_SHORT).show();
                this.finish();
                break;

        }
    }

    private void login() {
        number = etNmb.getText().toString().trim();
        password = etPassword.getText().toString().trim();

        if (number.equals("null")) {
            Toast.makeText(this, "请输入账号", Toast.LENGTH_SHORT).show();
            return;
        }
        if (password.equals("null")) {

            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }


        //发送登陆请求
        getLoginResult();
    }

    private void getLoginResult() {


        OkHttpUtils.get().url(Contants.loginUri).addParams("verify", deviceId)
                .addParams("phone", number)
                .addParams("pwd", password)
                .build().execute(new Callback() {
            @Override
            public Object parseNetworkResponse(Response response, int id) throws Exception {
                String json = response.body().string();
                Log.e("AAA", "parseNetworkResponse: " + json);
                Gson gson = new Gson();
                loginBean = gson.fromJson(json, LoginBean.class);
                if (loginBean.getStatus().equals("0")) {
                    Toast.makeText(LoginActivity.this, "手机号错误", Toast.LENGTH_SHORT).show();

                } else if (loginBean.getStatus().equals("1")) {
                    Toast.makeText(LoginActivity.this, "密码输入错误", Toast.LENGTH_SHORT).show();

                } else if (loginBean.getStatus().equals("2")) {
                    //status 为2 是登陆成功，检查GPS定位是否开启


                    //开始存数据，①json串给保存了②把type1的0条数据的id进行了保存，③电话号④公司名
                    PreferenceUtils.putString(LoginActivity.this, "typeid", loginBean.getType1().get(0).getId());
                    PreferenceUtils.putString(LoginActivity.this, "loginResult", json);
                    PreferenceUtils.putString(LoginActivity.this, "phone", number);
                    PreferenceUtils.putString(LoginActivity.this, "companyName", loginBean.getCompanyName());

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();



                }


                return json;
            }

            @Override
            public void onError(Call call, Exception e, int id) {

            }
            @Override
            public void onResponse(Object response, int id) {

            }
        });
    }
}
