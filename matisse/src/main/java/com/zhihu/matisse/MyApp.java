package com.zhihu.matisse;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by florian on 06/02/2018.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Phenomena-Regular.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
