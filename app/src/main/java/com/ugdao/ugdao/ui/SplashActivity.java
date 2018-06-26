package com.ugdao.ugdao.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ugdao.ugdao.R;
import com.ugdao.ugdao.ui.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SplashActivity extends BaseActivity {
    @BindView(R.id.iv_splash)
    ImageView ivSplash;
    @BindView(R.id.tv_skip)
    TextView tvSkip;
    @BindView(R.id.btn_skip)
    Button btnSkip;
    @BindView(R.id.ll_skip)
    LinearLayout llSkip;
//    private String uri = "http://waiqin.ugdao.com/Public/images/splashlash.jpg";
    private boolean isFirsLoad = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        //这里需要一个进行倒计时的操作，直接进行登陆（保存一个登陆的状态一个字符串或者是boolean值），判断版本号进行更新下载


    }


    @OnClick({R.id.tv_skip, R.id.btn_skip, R.id.ll_skip})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_skip:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_skip:
                Intent intent1 = new Intent(this, LoginActivity.class);
                startActivity(intent1);
                break;
            case R.id.ll_skip:

                Intent intent2 = new Intent(this, LoginActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
