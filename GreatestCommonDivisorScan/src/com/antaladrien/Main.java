package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = myObj.nextInt();
        System.out.println("Enter second number:");
        int num2 = myObj.nextInt();
        System.out.println("The greatest common divisor: "
                + getGreatestCommonDivisor(num1,num2));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int same = 0;
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                for (int j = 1; j <= second; j++) {
                    if (second % i == 0) {
                        same = i;
                    }
                }
            }
        }
        return same;
    }
}
