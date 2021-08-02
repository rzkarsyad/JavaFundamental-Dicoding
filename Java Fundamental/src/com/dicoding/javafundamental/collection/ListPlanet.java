package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args){
    // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "Riki";
        heroes[1] = "sven";
    // heroes[2] = "Zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

    // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planet awal:");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    // method size() untuk mendapatkan ukuran list
    // method get() untuk melihat isi List pada index i

        planets.remove("venus");
        System.out.println("List planet terakhir:");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }

}
