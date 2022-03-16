package hu.progmatic;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        // Kérd be a felhasználó nevét és életkorát,
        // és állapítsd meg, hogy a felhasználó ihat-e alkoholt vagy sem! (Azaz elmúlt-e már 18 éves.)
        //ha a felhasználó kiskorú, akkor számítsd ki, hogy hány évet kell még várnia az alkoholfogyasztással
        // (azaz hány év múlva lesz 18 éves), és írd ki a képernyőre:
        //“Sajnálom, kedves {név}, te még nem ihatsz alkoholt. Próbálkozz {x} év múlva!”
        //ha a felhasználó nagykorú, akkor számítsd ki azt, hogy hány éve ihat már alkoholt
        // (azaz hány évvel ezelőtt töltötte be a 18-at), és írd ki a képernyőre:
        //“Gratulálok, kedves {név}, te már {x} éve ihatsz!”
        //A {név} helyére helyettesítsd be a felhasználó nevét,
        // az {x} helyére pedig a számot (hogy hány évig nem ihat még, vagy hány éve ihat már).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üdvözöllek! Hogy hívnak?: ");
        String name = scanner.nextLine();
        System.out.println("Kedves " + name + "! Kérlek add meg, hogy hány éves vagy: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int yearsToDrink = 18 - age;
        int yearsOfDrink = age - 18;

        if (age < 18) {
            System.out.println("Sajnálom kedves " + name + ", te még nem ihatsz alkoholt. Próbálkozz " + yearsToDrink + " év múlva");
        } else if (age == 18) {
            System.out.println("Gratulálok kedves " + name + ", te már ihatsz, bár ez még az első éved a kocsmában, úgyhogy csak óvatosan!");

        } else {
            System.out.println("Gratulálok kedves " + name + ", te már " + yearsOfDrink + " éve ihatsz alkoholt.");

        }


    }
}
