package com.lethimyduyen.model;

public class ShoppingCartItem {
    int productThumb, productIncrease, productDecrease;
    boolean productCheck;
    String productName, productMass;
    double productPrice;
    int productNumb;

    public ShoppingCartItem(int productThumb, int productIncrease, int productDecrease, boolean productCheck, String productName, String productMass, double productPrice, int productNumb) {
        this.productThumb = productThumb;
        this.productIncrease = productIncrease;
        this.productDecrease = productDecrease;
        this.productCheck = productCheck;
        this.productName = productName;
        this.productMass = productMass;
        this.productPrice = productPrice;
        this.productNumb = productNumb;
    }

    public int getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(int productThumb) {
        this.productThumb = productThumb;
    }

    public int getProductIncrease() {
        return productIncrease;
    }

    public void setProductIncrease(int productIncrease) {
        this.productIncrease = productIncrease;
    }

    public int getProductDecrease() {
        return productDecrease;
    }

    public void setProductDecrease(int productDecrease) {
        this.productDecrease = productDecrease;
    }

    public boolean getProductCheck() {
        return productCheck;
    }

    public void setProductCheck(boolean productCheck) {
        this.productCheck = productCheck;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMass() {
        return productMass;
    }

    public void setProductMass(String productMass) {
        this.productMass = productMass;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductNumb() {
        return productNumb;
    }

    public void setProductNumb(int productNumb) {
        this.productNumb = productNumb;
    }
}
