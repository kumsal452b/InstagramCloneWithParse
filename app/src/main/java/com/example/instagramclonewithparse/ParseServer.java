package com.example.instagramclonewithparse;

import android.app.Application;

import com.parse.Parse;

public class ParseServer extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                        .clientKey("MkCWxoSyjRq7ZeRIYbXx04Ds5uIsurezKJFS3pRE")
                        .applicationId("q2vou08N28mNr5k1J6lnPqLUSkC96VeFpo0gO5b9")
                        .server("https://parseapi.back4app.com/")
                        .build()
        );
    }
}
