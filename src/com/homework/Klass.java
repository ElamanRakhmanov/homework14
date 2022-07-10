package com.homework;

public class Klass { private int number;
    private String word;
    private int [] array;

    public Klass(){

    }
    public Klass(int number, String word){
        this.number = number;
        this.word = word;

    }
    public Klass(int [] array){
        this.array = array;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    public int[] getArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        return array;
    }
}
