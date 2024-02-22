import java.util.Scanner;

public class fel4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mekkora legyen a háromszög? ");
        int csillagok = scanner.nextInt();
        for (int i = 1; i <= csillagok; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

