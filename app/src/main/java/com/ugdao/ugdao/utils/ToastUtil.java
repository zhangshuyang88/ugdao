package com.ugdao.ugdao.utils;

import android.widget.Toast;


/**
 * Created by zsy on 2017/5/10.
 * 自定义吐司
 */

public class ToastUtil {
    private Toast toast = null;
       /*
        * 显示toast
        */
    public void ShowToast(String s) {
        if (toast== null){

//            toast = Toast.makeText(MyApplication.getInstance(), s, Toast.LENGTH_SHORT);

        }else{

            toast.setText(s);

        }
        toast.show();
    }

}
