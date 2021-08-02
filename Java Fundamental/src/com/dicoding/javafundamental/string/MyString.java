package com.dicoding.javafundamental.string;

public class MyString {
    public static void main(String[] args){
        char[] dicodingChars = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

    String dicoding = "Dicoding";
    int length = dicoding.length();
    System.out.println("Panjang kata " + dicoding + " ada " + length + " huruf");

    char result = dicoding.charAt(7);
    System.out.println("Huruf ke 8 dari kata " + dicoding + " adalah " + result);

    }

}
