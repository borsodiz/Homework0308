package hu.progmatic;

public class Task8 {

    public static void main(String[] args) {
        // Írj programot, ami három double adattípusú számról eldönti, hogy azokból szerkeszthető-e derékszögű háromszög!
        // (Lásd: Pitagorasz-tétel.)
        //A számokat ezúttal ne a felhasználótól kérd, hanem add meg változók értékeként a programkódban.

        double n1 = 1.7;
        double n2 = 2.472;
        double n3 = 3.0;

        double a =  n1 * n1;
        double b =  n2 * n2;
        double c =  n3 * n3;


       if ((a + b == c) || (a + c == b) || (b + c == a)) {
            System.out.println("Ezekkel a számokkal szerkeszthető derékszögű háromszög.");
        } else {
            System.out.println("Ezekkel a számokkal nem szerkeszthető derékszöbő háromszög");
        }



    }
}
