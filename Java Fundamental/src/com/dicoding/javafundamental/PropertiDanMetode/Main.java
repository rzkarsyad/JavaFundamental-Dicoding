package com.dicoding.javafundamental.PropertiDanMetode;

public class Main {
    public static void main(String[] args){
    Hewan kucing = new Hewan(2);
    kucing.makan();
    kucing.jalan();
    kucing.lari();

    // Contoh penggunaan fungsi getUmur
    System.out.println("Umurnya adalah" + kucing.getUmur());

    // Perhitungan indeks massa tubuh BMI
        double bmi = kucing.getBerat() / (kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01);
    System.out.println("Indeks massa tubuhnya adalah" + bmi);
    }
}
