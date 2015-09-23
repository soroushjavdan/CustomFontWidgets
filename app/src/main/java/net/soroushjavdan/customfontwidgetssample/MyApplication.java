package net.soroushjavdan.customfontwidgetssample;

import android.app.Application;

import net.soroushjavdan.customfontwidgets.FontUtils;

/**
 * Created by SoroushJavdan on 9/23/2015.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FontUtils.createFonts(this,"fonts");
        FontUtils.setDefaultFont(this, "fonts", "RightWay");
    }
}
