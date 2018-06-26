package com.ugdao.ugdao.ui;

import android.os.AsyncTask;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ugdao.ugdao.R;

public class ProtactProtocolActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protact_protocol);



    }

    public class MyTask extends AsyncTask<String,Integer,Boolean>{

        //开启子线程进行网络请求
        @Override
        protected Boolean doInBackground(String... strings) {
            return null;
        }

        //开始前做一些初始化准备
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        //网络请求完毕，进行更新Ui的操作
        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }

        // 根据后台完成的进度，跟新进度。
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

        }
    }
}
