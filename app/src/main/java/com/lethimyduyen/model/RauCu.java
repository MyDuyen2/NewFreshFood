package com.lethimyduyen.model;

public class RauCu {
    int hinhRauCu, yeuthichRauCu, giohangRauCu;
    String tenRauCu, khoiluongRauCu;
    double giaRauCu;

    public RauCu(int hinhRauCu, int yeuthichRauCu, int giohangRauCu, String tenRauCu, String khoiluongRauCu, double giaRauCu) {
        this.hinhRauCu = hinhRauCu;
        this.yeuthichRauCu = yeuthichRauCu;
        this.giohangRauCu = giohangRauCu;
        this.tenRauCu = tenRauCu;
        this.khoiluongRauCu = khoiluongRauCu;
        this.giaRauCu = giaRauCu;
    }

    public int getHinhRauCu() {
        return hinhRauCu;
    }

    public void setHinhRauCu(int hinhRauCu) {
        this.hinhRauCu = hinhRauCu;
    }

    public int getYeuthichRauCu() {
        return yeuthichRauCu;
    }

    public void setYeuthichRauCu(int yeuthichRauCu) {
        this.yeuthichRauCu = yeuthichRauCu;
    }

    public int getGiohangRauCu() {
        return giohangRauCu;
    }

    public void setGiohangRauCu(int giohangRauCu) {
        this.giohangRauCu = giohangRauCu;
    }

    public String getTenRauCu() {
        return tenRauCu;
    }

    public void setTenRauCu(String tenRauCu) {
        this.tenRauCu = tenRauCu;
    }

    public String getKhoiluongRauCu() {
        return khoiluongRauCu;
    }

    public void setKhoiluongRauCu(String khoiluongRauCu) {
        this.khoiluongRauCu = khoiluongRauCu;
    }

    public double getGiaRauCu() {
        return giaRauCu;
    }

    public void setGiaRauCu(double giaRauCu) {
        this.giaRauCu = giaRauCu;
    }
}
