package hu.progmatic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        //Kérj be a felhasználótól két számot,
        // és állapítsd meg, hogy a második szám osztója-e az elsőnek!
        //Egy szám akkor osztója egy másiknak, ha maradék nélkül osztható vele.
        //Ügyelj arra, hogy ha a felhasználó második számnak a 0-t (nullát) adja meg,
        // akkor osztás nem végezhető! (A program ebben az esetben hibát generál.)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg két számot: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("0-tól különböző számot adj meg");

        }
        else  if (num1 % num2 ==0) {
                System.out.println("A második szám osztója az első számnak.");
            }
         else {
                System.out.println("A második szám nem osztója az első számnak.");
            }
        }
    }

