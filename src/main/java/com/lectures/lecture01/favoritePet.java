package com.lectures.lecture01;

import java.util.Scanner;

public class favoritePet {
    public static void main(String[] args){
        Scanner scanObject = new Scanner(System.in);
         String petName = scanObject.nextLine();
         String petFavoriteAction = scanObject.nextLine();

         System.out.println("My favorite dog " + petName + " really likes to " + petFavoriteAction);
    }
}
