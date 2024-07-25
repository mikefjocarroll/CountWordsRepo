package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type a word or sentence");
        String userInput = input.nextLine();
        Scanner fileScan= new Scanner(userInput).useDelimiter("[ ,!?.]+");
        String word;
        int count = 0;
        while(fileScan.hasNext()){
            word= fileScan.next();
            count = count + 1;
        }

        System.out.println("There were " + count + " words inputted from user.");
    }
}