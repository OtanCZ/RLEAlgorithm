package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
        string = RLEAlgorithm.encode(string);
        System.out.println(string);
        string = RLEAlgorithm.decode(string);
        System.out.println(string);
    }
}
