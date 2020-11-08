package com.lectures.lecture05;

public class homeWork05<str1, str2> {
    public static void main(String[] args) {
        String sentence = "My name is Test.";
        String test = " What is your name?";

        //replace "Test" with another word
        System.out.println(sentence.replace("Test", "Funny-Bunny"));

        // check if the 2 strings are equals
        System.out.println(sentence.equals("test"));

        //verify how many are the words in the sentence by space
        String[] stringParts;
        stringParts = sentence.split(" ");
        System.out.println(stringParts.length);

        // concatenate both strings
        System.out.println(sentence.concat(test));

    }
}

