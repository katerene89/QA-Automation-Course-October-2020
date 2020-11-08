package com.lectures.lecture06;
import java.util.Scanner;

public class homeWorkPositiveNegative06 {
    // write a program that verify wheter the number is positive or negative

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is neither positive nor negative");
        }
    }
}

