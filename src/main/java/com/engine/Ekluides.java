package com.engine;

import java.util.Scanner;

public class Ekluides {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj większą liczbę");
        int a = scanner.nextInt();
        System.out.println("podaj mniejszą liczbę");
        int b = scanner.nextInt();

        System.out.println("NWD dla " + a + " i " + b + " to " + nwd(a, b));
    }

    private static int nwd(int a, int b) {
        if (b == 0)
            return a;
        return nwd(b, a % b);
    }

}

