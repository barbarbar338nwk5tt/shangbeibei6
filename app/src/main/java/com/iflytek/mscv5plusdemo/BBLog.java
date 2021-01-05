package com.iflytek.mscv5plusdemo;

import android.util.Log;


/**
 * Created by ron on 2016/11/30.
 * <p>商贝贝 专用 bug 日志</p>
 */
public class BBLog {
    public static boolean isOpen =  true ;
    private static String TAG = "shangbeibei";

    public static void LogE(String tag, String msg) {
        if (isOpen) {
            Log.e(tag, msg);
        }
    }

    public static void LogE(String msg) {
        LogE(TAG, msg);
    }


    public static void LogI(String tag, String msg) {
        if (isOpen) {
            Log.i(tag, msg);
        }
    }

    public static void LogI(String msg) {
        LogI(TAG, msg);
    }
}
