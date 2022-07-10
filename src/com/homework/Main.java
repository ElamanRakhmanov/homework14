package com.homework;

public class Main {
    public static void main(String[] args) {
        Klass klass = new Klass(123,"Elaman");
        System.out.println(klass.getNumber());
        System.out.println(klass.getWord());
        Klass klass1 = new Klass(new int[]{1, 2, 3, 4, 9, -2, -7});
        klass1.getArray();

    }
}