package hu.progmatic;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // Kérd be a felhasználó nemét (lehetséges értékek: no/ffi),
        // és a nemének megfelelően üdvözöld őt!
        //“no” esetében az üdvözlés: “Kezicsókolom!”
        //“ffi” esetében az üdvözlés: “Jó napot kívánok!”
        //ha mást ír be a felhasználó, akkor az üdvözlés: “Üdv!”

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nemét (no/ffi): ");

        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("no")) {
            System.out.println("Kezicsókolom!");

        } else if (name.equalsIgnoreCase("ffi")) {
            System.out.println("Jó napot kívánok!");
        } else {
            System.out.println("Üdv!");
        }


    }
}
