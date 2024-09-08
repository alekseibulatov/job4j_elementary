package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(String.format("Size array ages is: %s", ages.length));
        System.out.println(String.format("Size array surnames is: %s", surnames.length));
        System.out.println(String.format("Size array prices is: %s", prices.length));
    }
}
