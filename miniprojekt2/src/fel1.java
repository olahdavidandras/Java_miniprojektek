import java.util.Scanner;

public class fel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kerek egy szot");
        String szo = scanner.nextLine();
        int i = szo.length();
        char elsobetu = szo.charAt(0);
        char utolsobetu = szo.charAt(i - 1);
        System.out.println("Elso betu: " + elsobetu);
        System.out.println("Utolso betu: " + utolsobetu);

        scanner.close();
    }
}
