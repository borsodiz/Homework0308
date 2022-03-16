package hu.progmatic;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        //Hozz létre egy egész szám adattípusú változót,
        // és adj értéket neki 1 és 100 között - beleértve a két szélső értéket is.
        // (Ez a szám lehet véletlenül generált.)
        // Majd kérj be a felhasználótól egy számot, és vesd össze a változód értékével!
        //ha a te változód értéke nagyobb, írd ki a képernyőre:
        //“Az én számom a nagyobb, vesztettél!”
        //ha a felhasználó száma a nagyobb, akkor azt írd ki, hogy:
        //“A te számod a nagyobb, te nyertél!”
        //ha a két szám egyenlő, akkor pedig ezt írd ki:
        //“Döntetlen!”

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int usernumber = scanner.nextInt();

        int mynumber = 89;

        if (usernumber < mynumber) {
            System.out.println("Az én számom nagyobb, vesztettél!");

        } else if (usernumber > mynumber) {
            System.out.println("A te számod a nagyobb, te nyertél!");
        } else {
            System.out.println("Döntetlen!");
        }

    }
}
