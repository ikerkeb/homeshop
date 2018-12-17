package com.kerkeb.homeshop;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "livraison a domicile 4.99€";
    }
}
