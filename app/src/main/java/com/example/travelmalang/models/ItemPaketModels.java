package com.example.travelmalang.models;

public class ItemPaketModels {
    String txtJudul;
    String txtHarga;
    int imgPaket;

    public ItemPaketModels(String txtJudul, String txtHarga, int imgPaket) {
        this.txtJudul = txtJudul;
        this.txtHarga = txtHarga;
        this.imgPaket = imgPaket;
    }

    public String getTxtJudul() {
        return txtJudul;
    }

    public void setTxtJudul(String txtJudul) {
        this.txtJudul = txtJudul;
    }

    public String getTxtHarga() {
        return txtHarga;
    }

    public void setTxtHarga(String txtHarga) {
        this.txtHarga = txtHarga;
    }

    public int getImgPaket() {
        return imgPaket;
    }

    public void setImgPaket(int imgPaket) {
        this.imgPaket = imgPaket;
    }
}
