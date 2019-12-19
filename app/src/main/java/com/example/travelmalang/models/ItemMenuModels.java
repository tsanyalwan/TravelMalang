package com.example.travelmalang.models;

public class ItemMenuModels {
    public String nama_paket;
    public String deskripsi;
    public int gambar;
    public String key;

    public ItemMenuModels(String nama_paket, String deskripsi, int gambar) {
        this.nama_paket = nama_paket;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getNama_paket() {
        return nama_paket;
    }

    public void setNama_paket(String nama_paket) {
        this.nama_paket = nama_paket;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
