package com.example.danhmuc;

public class Contact {
    private String ten;
    private String mota;
    private int anh;

    public Contact(String ten, String mota, int anh) {
        this.ten = ten;
        this.mota = mota;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public String getMota() {
        return mota;
    }

    public int getAnh() {
        return anh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}

