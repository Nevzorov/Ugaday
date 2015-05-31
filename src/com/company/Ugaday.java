package com.company;

import java.util.Scanner;

public class Ugaday {
    public static void main(String[] args) {
        int data;
        int zagadka = 5;
        int i = 1;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number from 0 to 10: ");
            data = in.nextInt();
            if (data == zagadka) {
                System.out.println("You win! After " + i + " attempt(s)");
            } else i++;
        } while (!(data == zagadka));
    }
}