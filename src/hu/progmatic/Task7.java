package hu.progmatic;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Kérj be a felhasználótól két számot, valamint egy matematikai műveleti jelet. Ez utóbbi lehetséges értékei: + - * /
        //A megadott jelnek megfelelően végezd el a műveletet a két számmal, és az eredményt írd ki a képernyőre!
        //Például: ha a felhasználó által megadott adatok ezek: 10 5 / , akkor az eredmény 2 (mert 10 / 5 = 2)
        //Ügyelj arra, hogy ha a felhasználó második számnak a 0-t (nullát) adja meg,
        // akkor osztás nem végezhető! (A program ebben az esetben hibát generál.)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérlek adj meg 2 egész számot: ");
        int userNumber1 = scanner.nextInt();
        scanner.nextLine();
        int userNumber2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérlek add meg, hogy milyen matematikai műveletet szeretnél elvégezni a 2 számmal (+; -; *; /): ");
        String mathSymbol = scanner.nextLine();

        if (mathSymbol.equalsIgnoreCase("+")) {
            System.out.println("Ha a két számot összeadjuk, akkor az eredmény: " + (userNumber1 + userNumber2));

        } else if (mathSymbol.equalsIgnoreCase("-")) {
            System.out.println("Ha a két számot kivonjuk egymásból, akkor az eredmény: "+  (userNumber1 - userNumber2));

        } else if (mathSymbol.equalsIgnoreCase("*")) {
            System.out.println("Ha a két számot összeszorozzuk, akkor az eredmény: " + (userNumber1 * userNumber2));

        } else if (mathSymbol.equalsIgnoreCase("/") && userNumber2 != 0) {
            System.out.println("Ha a két számot elosztjuk egymással, akkor az eredmény: " + (userNumber1 / userNumber2));

        } else if (mathSymbol.equalsIgnoreCase("/") && userNumber2 == 0) {
            System.out.println("Sajnálom a művelet nem hajtható végre, mert 0-ával nem lehet osztani. ");
        }


    }

}
