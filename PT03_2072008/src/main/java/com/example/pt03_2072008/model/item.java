package com.example.pt03_2072008.model;

public class item {
    private String nama;
    private float harga;
    private float diskon;

    public item(String nama, Float harga, Float diskon) {
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public Float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    @Override
    public String toString() {
        if(diskon != 0.0) {
            return nama +" " + (harga - (harga*diskon)) + " (original price : " + harga + " )" + " Diskon : " + (diskon*100) + "%";
        } else if (harga != 0.0) {
            return nama + " " + harga;
        } else {
            return nama + " ";
        }
    }
}
