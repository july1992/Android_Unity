package com.vily.asdadadsasd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;


public class SspManager {


    private static Context mContext;
    private static SspManager sspManager;
    /**
     * 实例化 SPAccount
     * @param context 当前 content
     * @return SPAccount 对象
     */
    public static SspManager getInstance(Activity context) {
        mContext = context;
        if (sspManager == null) {
            synchronized (SspManager.class) {
                if (sspManager == null) {
                    sspManager = new SspManager(context);
                }
            }
        }
        return sspManager;
    }

    private SspManager(Activity context) {

    }

    public void toMain() {

        Intent intent = new Intent();

        intent.setClass(mContext, MainActivity.class);
        mContext.startActivity(intent);

    }

    public String test(){

        return "sss";
    }

}
