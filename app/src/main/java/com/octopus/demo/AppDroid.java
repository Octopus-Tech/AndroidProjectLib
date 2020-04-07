package com.octopus.demo;

import android.app.Application;

import com.common.App;


/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-06]
 */
public class AppDroid extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        App.init(this);
    }
}
