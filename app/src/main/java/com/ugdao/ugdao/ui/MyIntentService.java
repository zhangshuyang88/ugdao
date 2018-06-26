package com.ugdao.ugdao.ui;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;


public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {

        //这里进行耗时操作
    }


    public static void init(Context context) {

        Intent intent = new Intent(context, MyIntentService.class);

        context.startService(intent);

    }

}