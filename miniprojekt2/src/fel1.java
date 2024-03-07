import java.util.Scanner;

public class fel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kerek egy szot");
        String szo = scanner.nextLine();
        int i = szo.length();
        if (i != 0) {
            char elsoBetu = szo.charAt(0);
            char utolsoBetu = szo.charAt(i - 1);
            System.out.println("Elso betu: " + elsoBetu);
            System.out.println("Utolso betu: " + utolsoBetu);
        }
        scanner.close();
    }
}
