package com.facebookintegration;

import android.content.Context;
import android.graphics.Color;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;
import com.leo.simplearcloader.SimpleArcLoader;

/**
 * Created by avinash
 */

public class CustomDialog {

    private static SimpleArcDialog mDialog;

    static int[] mColors = {Color.parseColor("#333333"),Color.parseColor("#333333")};

    public static void showCustomDialog(Context context) {
        mDialog = new SimpleArcDialog(context);
        ArcConfiguration configuration = new ArcConfiguration(context);
        configuration.setColors(mColors);
        configuration.setTextColor(Color.parseColor("#333333"));
        configuration.setText(context.getResources().getString(R.string.loading));
        configuration.setAnimationSpeedWithIndex(SimpleArcLoader.SPEED_MEDIUM);
        mDialog.setConfiguration(configuration);
        mDialog.show();
    }

    public static void dismissCustomDialog(Context context) {
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.dismiss();
        }
    }

}
