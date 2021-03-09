package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GF0repOeCMBntkNjPyrraSQLcJ1wEhYpmsMbU4e5")
                .clientKey("ivkU1wDOhfdsZ0GRucetse20E8NUlunxgTLGJ54W")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
