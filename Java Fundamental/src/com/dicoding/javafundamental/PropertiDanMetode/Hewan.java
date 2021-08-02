package com.dicoding.javafundamental.PropertiDanMetode;

public class Hewan {

    // inisialisasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // inisialisasi dengan konstruktor
    int umur;

    Hewan(int umur){
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    double getUmur(){
        return umur;
    }
}
