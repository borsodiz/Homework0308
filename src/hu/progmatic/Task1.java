package hu.progmatic;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Kérj be a felhasználótól egy számot,
        // és állapítsd meg, hogy páros-e vagy páratlan az a szám!
        // Írd ki a képernyőre az eredményt.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");

        long num1 = scanner.nextInt();


        if (num1 % 2 ==0) {
            System.out.println("A szám, amit megadtál egy páros szám.");
        }
        else {
            System.out.println("A szám, amit megadtál egy páratlan szám.");
        }

    }
}
