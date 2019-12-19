package com.example.travelmalang.models;

public class PaketModels {
    String txt_paket;
    int gbr_paket;

    public PaketModels(String txt_paket, int gbr_paket) {
        this.txt_paket = txt_paket;
        this.gbr_paket = gbr_paket;
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
}
