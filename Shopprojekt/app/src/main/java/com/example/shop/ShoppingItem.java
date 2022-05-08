package com.example.shop;

public class ShoppingItem {
    private String info;
    private String name;
    private String price;
    private Float ratedInfo;
    private int imageResource;

    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Float getRatedInfo() {
        return ratedInfo;
    }

    public int getImageResource() {
        return imageResource;
    }

    public ShoppingItem(String info, String name, String price, Float ratedInfo, int imageResource) {
        this.info = info;
        this.name = name;
        this.price = price;
        this.ratedInfo = ratedInfo;
        this.imageResource = imageResource;
    }
}
