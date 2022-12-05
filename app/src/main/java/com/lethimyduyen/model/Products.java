package com.lethimyduyen.model;

public class Products {
    private int image;
    private String name;
    private String mass;
    private String price;

    public Products(int image, String name, String mass, String price) {
        this.image = image;
        this.name = name;
        this.mass = mass;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
