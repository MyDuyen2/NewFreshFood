package com.lethimyduyen.model;

public class BanChay {
    int hinhBanChay, nutChonMua;
    String tenBanChay;
    double giaBanChay;

    public BanChay(int hinhBanChay, int nutChonMua, String tenBanChay, double giaBanChay) {
        this.hinhBanChay = hinhBanChay;
        this.nutChonMua = nutChonMua;
        this.tenBanChay = tenBanChay;
        this.giaBanChay = giaBanChay;
    }

    public int getHinhBanChay() {
        return hinhBanChay;
    }

    public void setHinhBanChay(int hinhBanChay) {
        this.hinhBanChay = hinhBanChay;
    }

    public int getNutChonMua() {
        return nutChonMua;
    }

    public void setNutChonMua(int nutChonMua) {
        this.nutChonMua = nutChonMua;
    }

    public String getTenBanChay() {
        return tenBanChay;
    }

    public void setTenBanChay(String tenBanChay) {
        this.tenBanChay = tenBanChay;
    }

    public double getGiaBanChay() {
        return giaBanChay;
    }

    public void setGiaBanChay(double giaBanChay) {
        this.giaBanChay = giaBanChay;
    }
}
