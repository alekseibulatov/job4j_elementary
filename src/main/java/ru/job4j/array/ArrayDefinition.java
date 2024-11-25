package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Andrey";
        names[2] = "Misha";
        names[3] = "Den";
        System.out.printf("Name first: %s%n", names[0]);
        System.out.printf("Name second: %s%n", names[1]);
        System.out.printf("Name third: %s%n", names[2]);
        System.out.printf("Name four: %s%n", names[3]);
        System.out.printf("Size array ages is: %s%n", ages.length);
        System.out.printf("Size array surnames is: %s%n", surnames.length);
        System.out.printf("Size array prices is: %s%n", prices.length);
    }
}
