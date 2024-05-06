package com.phone.iphone.models;

public class iPhone {
    private String color;

    private String model;

    private boolean display;

    public iPhone(String color, String model) {
        this.color = color;
        this.model = model;
        this.display = false;
    }

    public String getModel() {
        return model;
    }

    public boolean displayPhone() {
        return this.display = true;
    }

}
