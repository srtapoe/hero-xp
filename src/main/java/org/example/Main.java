package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMessage();
    }

    public static void showMessage(){
        Scanner data = new Scanner(System.in);
        System.out.println("Please enter Hero's name: ");
        String hero = data.nextLine();
        System.out.println("Please enter Hero's level: ");
        int level = data.nextInt();

        if (level <= 1000){
            System.out.println("The hero " + hero + "is on the level Iron");
        }else if (level <= 2000){
            System.out.println("The hero " + hero + "is on the level Bronze");
        }else if (level <= 5000){
            System.out.println("The hero " + hero + "is on the level Silver");
        }else if (level <= 7000){
            System.out.println("The hero " + hero + "is on the level Gold");
        }else if (level <= 8000){
            System.out.println("The hero " + hero + "is on the level Platinum");
        } else if (level <= 9000) {
            System.out.println("The hero " + hero + "is on the level Ascending");
        } else if (level < 10000) {
            System.out.println("The hero " + hero + "is on the level Immortal");
        } else {
            System.out.println("The hero " + hero + " is on the level Sunshine");
        }

    }
}