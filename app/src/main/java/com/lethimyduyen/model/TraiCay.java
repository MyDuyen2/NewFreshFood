package com.lethimyduyen.model;

public class TraiCay {
    int hinhTraiCay, yeuthichTraiCay, giohangTraiCay;
    String tenTraiCay, khoiluongTraiCay;
    double giaTraiCay;

    public TraiCay(int hinhTraiCay, int yeuthichTraiCay, int giohangTraiCay, String tenTraiCay, String khoiluongTraiCay, double giaTraiCay) {
        this.hinhTraiCay = hinhTraiCay;
        this.yeuthichTraiCay = yeuthichTraiCay;
        this.giohangTraiCay = giohangTraiCay;
        this.tenTraiCay = tenTraiCay;
        this.khoiluongTraiCay = khoiluongTraiCay;
        this.giaTraiCay = giaTraiCay;
    }

    public int getHinhTraiCay() {
        return hinhTraiCay;
    }

    public void setHinhTraiCay(int hinhTraiCay) {
        this.hinhTraiCay = hinhTraiCay;
    }

    public int getYeuthichTraiCay() {
        return yeuthichTraiCay;
    }

    public void setYeuthichTraiCay(int yeuthichTraiCay) {
        this.yeuthichTraiCay = yeuthichTraiCay;
    }

    public int getGiohangTraiCay() {
        return giohangTraiCay;
    }

    public void setGiohangTraiCay(int giohangTraiCay) {
        this.giohangTraiCay = giohangTraiCay;
    }

    public String getTenTraiCay() {
        return tenTraiCay;
    }

    public void setTenTraiCay(String tenTraiCay) {
        this.tenTraiCay = tenTraiCay;
    }

    public String getKhoiluongTraiCay() {
        return khoiluongTraiCay;
    }

    public void setKhoiluongTraiCay(String khoiluongTraiCay) {
        this.khoiluongTraiCay = khoiluongTraiCay;
    }

    public double getGiaTraiCay() {
        return giaTraiCay;
    }

    public void setGiaTraiCay(double giaTraiCay) {
        this.giaTraiCay = giaTraiCay;
    }
}
