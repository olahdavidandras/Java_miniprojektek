import java.util.Random;
import java.util.Scanner;

public class bonusz2 {
    public static void main(String[] args) {
        boolean megoldas = false;
        int talalatok = 1;
        Random rand = new Random();
        int randomszam = rand.nextInt(100);
        while (!megoldas) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tippelj:");
            int tipp = scanner.nextInt();
            if (tipp == randomszam) {
                System.out.println("Nyertel " + talalatok + " talalatbol");
                megoldas=true;
            } else if (tipp > randomszam) {
                System.out.println("A szam kisebb");
                talalatok += 1;
            } else {
                System.out.println("A szam nagyobb");
                talalatok += 1;
            }
        }
    }
}
