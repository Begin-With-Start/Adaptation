package com.minifly.adaptation;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * author ：minifly
 * date: 2017/9/14
 * time: 15:16
 * desc:
 */
public class DensityUtils {

    /**
     * 整机的分辨率 宽
     * @param mContext
     * @return
     */
    public static int getScreenWidth(Activity mContext){
        DisplayMetrics dm = new DisplayMetrics();
        // 获取屏幕信息
        mContext.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }
    /**
     * 整机的分辨率 高
     * @param mContext
     * @return
     */
    public  static int getScreenHeight(Activity mContext){
        DisplayMetrics dm = new DisplayMetrics();
        // 获取屏幕信息
        mContext.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

}
