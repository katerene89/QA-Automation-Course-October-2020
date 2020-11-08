package com.lectures.lecture06;

import java.util.Scanner;

public class homeWork06 {
    //write a program that print the days of the week when we enter a number.
    public static void main(String[] args){
            int day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

            switch(day)
            {
                case 1:
                    System.out.println("You entered 1. So week day is Monday.");
                    break;
                case 2:
                    System.out.println("You entered 2. So week day is Tuesday.");
                    break;
                case 3:
                    System.out.println("You entered 3. So week day is Wednesday.");
                    break;
                case 4:
                    System.out.println("You entered 4. So week day is Thursday.");
                    break;
                case 5:
                    System.out.println("You entered 5. So week day is Friday.");
                    break;
                case 6:
                    System.out.println("You entered 6. So week day is Saturday.");
                    break;
                case 7:
                    System.out.println("You entered 7. So week day is Sunday.");
                    break;
                default:
                    System.out.println("Week");
                    break;
            }
        }
    }

