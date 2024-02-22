import java.util.Scanner;

public class fel5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy szöveget! ");
        String szoveg = scanner.next();
        if (szoveg.matches("[a-zA-Z]+")) {
            System.out.println("A string csak betűket tartalmaz.");
        } else {
            System.out.println("A string nem csak betűket tartalmaz.");
        }
        scanner.close();
    }
}
