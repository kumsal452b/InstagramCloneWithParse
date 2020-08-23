package com.example.instagramclonewithparse;

import android.app.Application;

import com.parse.Parse;

public class ParseServer extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                        .clientKey("")
                        .applicationId("")
                        .server("")
                        .build()
        );
    }
}
