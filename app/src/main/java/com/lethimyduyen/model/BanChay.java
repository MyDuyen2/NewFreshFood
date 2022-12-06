package com.lethimyduyen.model;

public class BanChay {
    int hinhBanChay, nutChonMua;
    String tenBanChay;
    double giaBanChay, giagocBanChay;
    String motaSPBanchay;

    public BanChay(int hinhBanChay, int nutChonMua, String tenBanChay, double giaBanChay) {
        this.hinhBanChay = hinhBanChay;
        this.nutChonMua = nutChonMua;
        this.tenBanChay = tenBanChay;
        this.giaBanChay = giaBanChay;

    }
//    public BanChay(int hinhBanChay, int nutChonMua, String tenBanChay, double giaBanChay, double giagocBanChay, String motaSPBanchay) {
//        this.hinhBanChay = hinhBanChay;
//        this.nutChonMua = nutChonMua;
//        this.tenBanChay = tenBanChay;
//        this.giaBanChay = giaBanChay;
//        this.giagocBanChay = giagocBanChay;
//        this.motaSPBanchay = motaSPBanchay;}

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
//
//    public double getGiagocBanChay() {
//        return giagocBanChay;
//    }
//
//    public void setGiagocBanChay(double giagocBanChay) {
//        this.giagocBanChay = giagocBanChay;
//    }
//
//    public String getMotaSPBanchay() {
//        return motaSPBanchay;
//    }
//
//    public void setMotaSPBanchay(String motaSPBanchay) {
//        this.motaSPBanchay = motaSPBanchay;
//    }

}
