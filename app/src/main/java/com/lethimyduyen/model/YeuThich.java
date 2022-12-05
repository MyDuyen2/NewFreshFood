package com.lethimyduyen.model;

public class YeuThich {
    int hinhYt, chonmua,delete;
    String tenYt,massYt;
    double giaYt;

    public YeuThich(int hinhYt, int chonmua,int delete, String tenYt, String massYt, double giaYt) {
        this.hinhYt = hinhYt;
        this.chonmua = chonmua;
        this.tenYt = tenYt;
        this.massYt = massYt;
        this.giaYt = giaYt;
        this.delete = delete;

    }

    public int getHinhYt() {
        return hinhYt;
    }

    public void setHinhYt(int hinhYt) {
        this.hinhYt = hinhYt;
    }

    public int getChonmua() {
        return chonmua;
    }

    public void setChonmua(int chonmua) {
        this.chonmua = chonmua;
    }
    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public String getTenYt() {
        return tenYt;
    }

    public void setTenYt(String tenYt) {
        this.tenYt = tenYt;
    }

    public String getMassYt() {
        return massYt;
    }

    public void setMassYt(String massYt) {
        this.massYt = massYt;
    }

    public double getGiaYt() {
        return giaYt;
    }

    public void setGiaYt(double giaYt) {
        this.giaYt = giaYt;
    }
}
