package com.ugdao.ugdao.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ugdao.ugdao.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.fl_layout)
    FrameLayout flLayout;
    @BindView(R.id.rb_home)
    RadioButton rbHome;
    @BindView(R.id.rb_message)
    RadioButton rbMessage;
    @BindView(R.id.rb_set)
    RadioButton rbSet;
    @BindView(R.id.rb_me)
    RadioButton rbMe;

    List<Integer> imges = new ArrayList<>();
    private View homeView;
    private View meView;
    private View setView;
    private View messageView;

    List list = new ArrayList();
    List<View> views = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        initView();
//        switchView(0);
        for(int i = 1 ; i < 10 ; i++){
            for(int j = 1; j < i ; j ++){
                System.out.print("\t");
            }
            for(int j = 1 ; j <= 10-i ; j++){
                System.out.print(j+"×"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }

        for(int i = 1 ; i < 10 ; i++){
            for(int j = 1 ; j <= 10-i ; j++){
                System.out.print(j+"×"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }

        for(int i = 1 ; i < 10 ; i++){
            for(int j = 1 ; j < 10-i ; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= i ; j ++){
                System.out.print(j+"×"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }

        


    }

    private void initView() {
        homeView = View.inflate(this, R.layout.activity_home, null);
        meView = View.inflate(this, R.layout.activity_me, null);
        setView = View.inflate(this, R.layout.activity_setting, null);
        messageView = View.inflate(this, R.layout.activity_message, null);
        views.add(homeView);
        views.add(messageView);
        views.add(setView);
        views.add(meView);

    }

    @OnClick({R.id.rb_home, R.id.rb_message, R.id.rb_set, R.id.rb_me})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb_home:
                switchView(0);
//                initHomeData();

                break;
            case R.id.rb_message:
                switchView(1);
                Toast.makeText(this, "消息", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_set:
                switchView(2);
                Toast.makeText(this, "设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_me:
                switchView(3);
                Toast.makeText(this, "我的", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    /**
     * 选择切换的view
     */
    private void switchView(int position) {

        for (int i = 0; i < views.size(); i++) {

            View view = views.get(i);
            if (i == position) {

                if (view.isShown()) {

                } else {
                    view.setVisibility(View.VISIBLE);
                    initHomeData(view);
                }


            } else {
                view.setVisibility(View.GONE);
            }
        }


    }

    private void initHomeData(View view) {
        List<String> titls = new ArrayList<>();
//        homeView = View.inflate(this, R.layout.activity_home, null);
        flLayout.addView(view);
        imges.add(R.drawable.t01);
        imges.add(R.drawable.t02);
        imges.add(R.drawable.t03);
        imges.add(R.drawable.t04);

        titls.add("苹果");
        titls.add("提子");
        titls.add("橘子");
        titls.add("葡萄");

        Banner banner = (Banner) homeView.findViewById(R.id.banner);


        banner.setImages(imges).setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE)
                .setBannerTitles(titls)
                .setDelayTime(4000)
                .setImageLoader(new GlideImageLoader())
                .setBannerAnimation(Transformer.Tablet).start();


        String s = new String("adc");


    }

    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            /**
             注意：
             1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
             2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器
             传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
             切记不要胡乱强转！
             */

            //Glide 加载图片简单用法
            Glide.with(context).load((int) path).into(imageView);

        }

        //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
        @Override
        public ImageView createImageView(Context context) {
//            //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
//            SimpleDraweeView simpleDraweeView=new SimpleDraweeView(context);
            return null;
        }
    }


}
