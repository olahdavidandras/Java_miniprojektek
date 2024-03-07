import java.util.Scanner;

public class fel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kerek egy szot");
        String szo = scanner.nextLine();
        String csillagSzo = "";
        for (int i = 0; i < szo.length(); i++) {
            if (szo.charAt(i) == 'a' || szo.charAt(i) == 'A') {
                csillagSzo += "*";
            } else {
                csillagSzo += szo.charAt(i);
            }
        }
        System.out.println(csillagSzo);

        scanner.close();
    }
}
