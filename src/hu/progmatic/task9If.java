package hu.progmatic;

import java.util.Scanner;

public class task9If {
    public static void main(String[] args) {
        // Írj programot, amely egy betűt vizsgál, és ha magánhangó az a betű, akkor kiírja, hogy “vowel”,
        // ha pedig mássalhangzó, akkor azt, hogy “consonant”.
        //Oldd meg a feladatot if-else és switch elágazással is!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy betűt ékezetek nélkül: ");
        String letter = scanner.nextLine();

        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }

}
