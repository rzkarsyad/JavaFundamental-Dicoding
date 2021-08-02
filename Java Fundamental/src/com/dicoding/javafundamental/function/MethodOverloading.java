package com.dicoding.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] args){
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l);
        System.out.println("Hasilnya adalah = " + hasil);
        
        int pn = 7;
        int lb = 6;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);
    }

    private static double hitungLuas(double p, double l) {
        double luas = p * l;
        return luas;
    }

    private static int hitungLuas(int pn, int lb) {
        int luas = pn * lb;
        return luas;
    }
}
