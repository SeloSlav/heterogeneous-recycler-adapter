package com.example.martin.heterogeneousrecycleradapter;

/**
 * Created by santafebound on 4.7.2016.
 */

public class President {
    public String name;
    public String hometown;

    public President(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }
}