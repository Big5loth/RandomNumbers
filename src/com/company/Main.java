package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Random random = new Random();
    //System.out.println("int one is " + random.nextInt(10));
    //System.out.println("First random double is " + random.nextDouble());

    //int min = 5;
    //int max = 10;
    //int newRandom = random.nextInt((max - min) + 1) + min;
    //System.out.println(newRandom);
    //System.out.println(Math.random());
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides does your die have?> ");
        int dieSides = input.nextInt();
        System.out.println("How many times do you want to throw it?> ");
        int[]rolls = new int[dieSides];
        int timesToThrow = input.nextInt();
        for (int i = 0; i < timesToThrow; i++) {
            int min = 1;
            int max = dieSides;
            Random random = new Random();
            int newRandom = random.nextInt((max - min) + 1) + min;
            System.out.println("Roll is " + newRandom);
        }
    }
}
