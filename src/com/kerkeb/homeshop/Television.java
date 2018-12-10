package com.kerkeb.homeshop;

public class Television extends Product {
    private int size;
    private String screenType;


    public Television(String name, String description, double price, int size, String screenType) {
        super(name, description, price);
        this.size = size;
        this.screenType = screenType;
    }

    public int getSize() {
        return size;
    }

    public String getScreenType() {
        return screenType;
    }
}
