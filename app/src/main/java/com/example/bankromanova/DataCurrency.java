package com.example.bankromanova;

public class DataCurrency {
    private int prodajaId;
    private int pokupkaId;
    private int imageId;
    private int nazvanieId;
    private int russianId;

    public DataCurrency(int _prodajaId, int _pokupkaId, int _imageId, int _russianId, int _nazvanieId){
        prodajaId = _prodajaId;
        pokupkaId = _pokupkaId;
        imageId = _imageId;
        nazvanieId = _nazvanieId;
        russianId = _russianId;

    }

    public int getImageId() {
        return imageId;
    }

    public int getNazvanieId() {
        return nazvanieId;
    }

    public int getPokupkaId() {
        return pokupkaId;
    }

    public int getProdajaId() {
        return prodajaId;
    }

    public int getRussianId() {
        return russianId;
    }
}
