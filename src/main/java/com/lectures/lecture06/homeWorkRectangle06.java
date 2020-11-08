package com.lectures.lecture06;

import java.util.Scanner;

public class homeWorkRectangle06 {
    // write e program that calculate the face and the parameter of the rectangle
    // P = 2*(a + b)
    // S = a*b

    public static void main(String[] args) {
        float a,b, P, S;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        P = 2*(a + b);
        S = a*b;

        System.out.println("The perimeter of the rectangle is: " + P);
        System.out.println("The face of the rectangle is: " + S);
    }
}
