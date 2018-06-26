package com.ugdao.ugdao.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;

public class PreferenceUtils {
    public static SharedPreferences sp;

    public static void getSharedPreference(Context context) {
        if (sp == null) {
            // 为空的时候 获取一次
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        }
    }


    public static  void getSharedPreferenceContinu(Context context){
        if (sp == null){
//            sp = context.getSharedPreferences("user",Context.MODE_APPEND);
        }
    }

    /**
     * 获取保存的
     *
     * @param key
     * @param defValue
     * @return
     */
    public static boolean getBoolean(Context context, String key,
                                     boolean defValue) {
        getSharedPreference(context);
        boolean result = sp.getBoolean(key, defValue);
        return result;
    }

    /**
     * 保存
     *
     * @param key
     * @param
     * @return
     */
    public static void putBoolean(Context context, String key, boolean value) {
        getSharedPreference(context);
        sp.edit().putBoolean(key, value).commit();
    }

    /**
     * 获取保存的
     *
     * @param key
     * @param defValue
     * @return
     */
    public static String getString(Context context, String key, String defValue) {
        getSharedPreference(context);
        String result = sp.getString(key, defValue);
        return result;
    }

    /**
     * 保存
     *
     * @param key
     * @param
     * @return
     */
    public static void putString(Context context, String key, String value) {
        getSharedPreference(context);
        sp.edit().putString(key, value).commit();
    }

    /**
     * 获取保存的
     *
     * @param key
     * @param defValue
     * @return
     */
    public static int getInt(Context context, String key, int defValue) {
        getSharedPreference(context);
        int result = sp.getInt(key, defValue);
        return result;
    }

    /**
     * 保存
     *
     * @param key
     * @param
     * @return
     */
    public static void putInt(Context context, String key, int value) {
        getSharedPreference(context);
        sp.edit().putInt(key, value).commit();
    }

    /**
     * 获取保存的HashSet集合
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static HashSet getHashSet(Context context, String key, HashSet defValue) {
        getSharedPreference(context);
        HashSet result = (HashSet) sp.getStringSet(key, defValue);

        return result;

    }


    /**
     * 保存一个HashSet集合
     *
     * @param context
     * @param key
     * @param value
     */
    public static void putHashSet(Context context, String key, HashSet value) {

        getSharedPreference(context);
        sp.edit().putStringSet(key, value).commit();

    }



//    /**
//     * 获取保存的HashSet集合
//     *
//     * @param context
//     * @param key
//     * @param defValue
//     * @return
//     */
//    public static HashMap getHashMep(Context context, String key, HashMap value) {
//        getSharedPreferenceContinu(context);
//        HashMap result = (HashMap) sp.getStringHashMap(key, value);
//
//        sp.
//
//        return result;
//
//    }
//
//
//    /**
//     * 保存一个HashSet集合
//     *
//     * @param context
//     * @param key
//     * @param value
//     */
//    public static void putHashMap(Context context, String key, HashMap value) {
//
//        getSharedPreferenceContinu(context);
//        sp.edit().putStringHashMap(key, value).commit();
//
//    }
}
