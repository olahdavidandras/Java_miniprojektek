import java.security.KeyStore;
import java.util.Scanner;

public class fel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy egész számot 1 és 10 között:");
        int szam = scanner.nextInt();
        if (szam >= 1 && szam <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(szam + "*" + i + "=" + szam * i);
            }
        } else {
            System.out.println("Nem jó számot adtál meg!");
        }
        scanner.close();
    }
}
