package com.engine;

import java.util.Scanner;

public class Ekluides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please give number one");
        double numberA = scanner.nextDouble();
        System.out.println("please give number one");
        double numberB = scanner.nextDouble();
        double greatestCommonDivisor = 1;
        if (numberB == numberB) {
            System.out.println("greatest common divisor is: " + numberA);
        } else {

            do {
                if (numberAIsBiggerThanNumberB(numberA, numberB)) {
                    greatestCommonDivisor = divideNumbersWithModuloAsResult(numberA, numberB);
                } else {
                    greatestCommonDivisor = divideNumbersWithModuloAsResult(numberB, numberA);
                }

            } while (greatestCommonDivisor == 0);
        }

    }


    private static double divideNumbersWithModuloAsResult(double numberOne, double numberTwo) {
        return numberOne % numberTwo;
    }

    private static boolean numberAIsBiggerThanNumberB(double numberA, double numberB) {
        if (numberA > numberB) {
            return true;
        } else {
            return false;
        }
    }
}
