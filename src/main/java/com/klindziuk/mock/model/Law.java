package com.klindziuk.mock.model;

/**
 * Created by Hp on 10/12/2017.
 */
public class Law {
    private String name;
    private int year;

    public Law(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
