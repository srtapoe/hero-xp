package org.example;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        showResult();
    }

    public static void showResult(){
        Scanner data = new Scanner(System.in);
        System.out.println("Please enter Hero's name: ");
        String hero = data.nextLine();
        System.out.println("Please enter Hero's level: ");
        int victories = data.nextInt();

        if (victories <= 10){
            System.out.println("The hero " + hero + "is on the level Iron");
        }else if (victories <= 20){
            System.out.println("The hero " + hero + "is on the level Bronze");
        }else if (victories <= 50){
            System.out.println("The hero " + hero + "is on the level Silver");
        }else if (victories <= 80){
            System.out.println("The hero " + hero + "is on the level Gold");
        }else if (victories <= 90){
            System.out.println("The hero " + hero + "is on the level Diamond");
        } else if (victories <= 100) {
            System.out.println("The hero " + hero + "is on the level Legendary");
        } else {
            System.out.println("The hero " + hero + "is on the level Immortal");
        }

    }
}
