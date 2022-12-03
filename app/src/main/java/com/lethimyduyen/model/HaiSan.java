package com.lethimyduyen.model;

public class HaiSan {
    int hinhHaiSan, yeuthichHaiSan, giohangHaiSan;
    String tenHaiSan, khoiluongHaiSan;
    double giaHaiSan;

    public HaiSan(int hinhHaiSan, int yeuthichHaiSan, int giohangHaiSan, String tenHaiSan, String khoiluongHaiSan, double giaHaiSan) {
        this.hinhHaiSan = hinhHaiSan;
        this.yeuthichHaiSan = yeuthichHaiSan;
        this.giohangHaiSan = giohangHaiSan;
        this.tenHaiSan = tenHaiSan;
        this.khoiluongHaiSan = khoiluongHaiSan;
        this.giaHaiSan = giaHaiSan;
    }

    public int getHinhHaiSan() {
        return hinhHaiSan;
    }

    public void setHinhHaiSan(int hinhHaiSan) {
        this.hinhHaiSan = hinhHaiSan;
    }

    public int getYeuthichHaiSan() {
        return yeuthichHaiSan;
    }

    public void setYeuthichHaiSan(int yeuthichHaiSan) {
        this.yeuthichHaiSan = yeuthichHaiSan;
    }

    public int getGiohangHaiSan() {
        return giohangHaiSan;
    }

    public void setGiohangHaiSan(int giohangHaiSan) {
        this.giohangHaiSan = giohangHaiSan;
    }

    public String getTenHaiSan() {
        return tenHaiSan;
    }

    public void setTenHaiSan(String tenHaiSan) {
        this.tenHaiSan = tenHaiSan;
    }

    public String getKhoiluongHaiSan() {
        return khoiluongHaiSan;
    }

    public void setKhoiluongHaiSan(String khoiluongHaiSan) {
        this.khoiluongHaiSan = khoiluongHaiSan;
    }

    public double getGiaHaiSan() {
        return giaHaiSan;
    }

    public void setGiaHaiSan(double giaHaiSan) {
        this.giaHaiSan = giaHaiSan;
    }
}
