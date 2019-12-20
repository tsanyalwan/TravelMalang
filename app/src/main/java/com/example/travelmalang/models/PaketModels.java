package com.example.travelmalang.models;

public class PaketModels {
    String txt_paket;
    String txt_judul;
    String txt_desc;
    int gbr_paket;
    String key;

    public PaketModels(){

    }

    public PaketModels(String txt_paket, String txt_judul, String txt_desc, int gbr_paket) {
        this.txt_paket = txt_paket;
        this.txt_judul = txt_judul;
        this.txt_desc = txt_desc;
        this.gbr_paket = gbr_paket;
    }

    public String getTxt_judul() {
        return txt_judul;
    }

    public void setTxt_judul(String txt_judul) {
        this.txt_judul = txt_judul;
    }

    public String getTxt_desc() {
        return txt_desc;
    }

    public void setTxt_desc(String txt_desc) {
        this.txt_desc = txt_desc;
    }

    public String getTxt_paket() {
        return txt_paket;
    }

    public void setTxt_paket(String txt_paket) {
        this.txt_paket = txt_paket;
    }

    public int getGbr_paket() {
        return gbr_paket;
    }

    public void setGbr_paket(int gbr_paket) {
        this.gbr_paket = gbr_paket;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
