package com.lethimyduyen.model;

public class ThitCa {
    int hinhThitCa, yeuthichThitCa, giohangThitCa;
    String tenThitCa, khoiluongThitCa;
    double giaThitCa;

    public ThitCa(int hinhThitCa, int yeuthichThitCa, int giohangThitCa, String tenThitCa, String khoiluongThitCa, double giaThitCa) {
        this.hinhThitCa = hinhThitCa;
        this.yeuthichThitCa = yeuthichThitCa;
        this.giohangThitCa = giohangThitCa;
        this.tenThitCa = tenThitCa;
        this.khoiluongThitCa = khoiluongThitCa;
        this.giaThitCa = giaThitCa;
    }

    public int getHinhThitCa() {
        return hinhThitCa;
    }

    public void setHinhThitCa(int hinhThitCa) {
        this.hinhThitCa = hinhThitCa;
    }

    public int getYeuthichThitCa() {
        return yeuthichThitCa;
    }

    public void setYeuthichThitCa(int yeuthichThitCa) {
        this.yeuthichThitCa = yeuthichThitCa;
    }

    public int getGiohangThitCa() {
        return giohangThitCa;
    }

    public void setGiohangThitCa(int giohangThitCa) {
        this.giohangThitCa = giohangThitCa;
    }

    public String getTenThitCa() {
        return tenThitCa;
    }

    public void setTenThitCa(String tenThitCa) {
        this.tenThitCa = tenThitCa;
    }

    public String getKhoiluongThitCa() {
        return khoiluongThitCa;
    }

    public void setKhoiluongThitCa(String khoiluongThitCa) {
        this.khoiluongThitCa = khoiluongThitCa;
    }

    public double getGiaThitCa() {
        return giaThitCa;
    }

    public void setGiaThitCa(double giaThitCa) {
        this.giaThitCa = giaThitCa;
    }
}
