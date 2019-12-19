package com.example.travelmalang.models;

import androidx.fragment.app.FragmentActivity;

import java.util.List;

public class ItemPaketModels {
    String txtJudul;
    String txtHarga;
    String txtDesc;
    int imgPaket;

    public ItemPaketModels(String txtJudul, String txtHarga, String txtDesc, int imgPaket) {
        this.txtJudul = txtJudul;
        this.txtHarga = txtHarga;
        this.txtDesc = txtDesc;
        this.imgPaket = imgPaket;
    }

    public ItemPaketModels(){

    }
    public String getTxtDesc() {
        return txtDesc;
    }

    public void setTxtDesc(String txtDesc) {
        this.txtDesc = txtDesc;
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

    public void setKey(String key) {
    }
}
