package com.example.martin.heterogeneousrecycleradapter;

/**
 * Created by santafebound on 4.7.2016.
 */

public class Sponsored {
    public String name;
    public String company;

    public Sponsored(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}