package hu.progmatic;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        // Írj egy lámpa-kapcsolgató programot!

        int myNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Válassz a '0' és az '1' értékek között: ");
        int userNumber = scanner.nextInt();


        int data = (myNumber == userNumber && myNumber == 0 ? 0 : 1);

        if (userNumber != 1 && userNumber != 0) {
            System.out.println("Nem tudom végrehajtani.");

        } else if (data == 0) {
            System.out.println("A lámpa már le van kapcsolva.");

        } else if (data == 1) {
            System.out.println("Felkapcsolom a lámpát.");

        }

    }
}
