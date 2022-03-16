package hu.progmatic;

import java.util.Scanner;

public class Task9Switch {
    public static void main(String[] args) {
        // Írj programot, amely egy betűt vizsgál, és ha magánhangó az a betű, akkor kiírja, hogy “vowel”,
        // ha pedig mássalhangzó, akkor azt, hogy “consonant”.
        //Oldd meg a feladatot if-else és switch elágazással is!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy betűt ékezetek nélkül: ");
        String letter = scanner.nextLine();

       switch (letter) {
           case "a":
               System.out.println("vowel");
               break;
           case "e":
               System.out.println("vowel");
               break;
           case "i":
               System.out.println("vowel");
               break;
           case "o":
               System.out.println("vowel");
               break;
           case "u":
               System.out.println("vowel");
               break;
           default:
               System.out.println("consonant");
       }

    }

}
