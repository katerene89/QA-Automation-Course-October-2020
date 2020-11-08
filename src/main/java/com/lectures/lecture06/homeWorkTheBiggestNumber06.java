package com.lectures.lecture06;

import java.util.Scanner;

public class homeWorkTheBiggestNumber06 {
    //write a number that verify which number is the biggest

    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a >=b && a>=c){
            System.out.println(a + " is the biggest Number");
        } else if(b>=a && b>=c) {
            System.out.println(b + " is the biggest Number");
        } else{
            System.out.println(c + " is the biggest Number");
        }
 }
}
