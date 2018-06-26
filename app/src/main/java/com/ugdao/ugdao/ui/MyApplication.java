package com.ugdao.ugdao.ui;

import android.app.Application;

/**
 * Created by 78759 on 2018/4/27.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MyIntentService.init(this);



    }
}
