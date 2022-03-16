package hu.progmatic;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        // Kérd be a felhasználó nemét (lehetséges értékek: no/ffi)
        // és a testmagasságát centiméterben,
        // majd állapítsd meg, hogy a felhasználó az átlagnál alacsonyabb, magasabb, vagy éppen átlagos.
        // Írd ki a képernyőre az eredményt.
        //A férfiak átlagmagassága 176 cm, a nőké pedig 164 cm.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nemét (no/ffi): ");
        String gender = scanner.nextLine();
        System.out.println("Kérem adja meg a magasságát cm-ben: ");
        int height = scanner.nextInt();

        if (gender.equalsIgnoreCase("no") && height > 164) {
            System.out.println("Hölgyem az Ön magassága az átlagmagasság felett van.");
        } else if (gender.equalsIgnoreCase("no") && height == 164 ) {
            System.out.println("Hölgyem az Ön magassága pont átlagos.");
        }else if (gender.equalsIgnoreCase("no") && height < 164){
            System.out.println("Hölgyem az Ön magassága az átlagmagasság alatt van.");
        }

        if (gender.equalsIgnoreCase("ffi") && height > 176) {
            System.out.println("Uram az Ön magassága az átlagmagasság felett van.");
        } else if (gender.equalsIgnoreCase("ffi") && height == 176 ) {
            System.out.println("Uram az Ön magassága pont átlagos.");
        }else if (gender.equalsIgnoreCase("ffi") && height < 176){
            System.out.println("Uram az Ön magassága az átlagmagasság alatt van.");
        }
    }
}
