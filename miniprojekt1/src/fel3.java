import java.util.Scanner;

public class fel3 {
    public static void main(String[] args) {
        int opcio = 0;
        int eredmeny;
        System.out.println("Kerem az elso szamot:");
        Scanner scanner = new Scanner(System.in);
        int szam1 = scanner.nextInt();
        System.out.println("Kerem a masodik szamot:");
        int szam2 = scanner.nextInt();
        while (opcio != 5) {
            System.out.println("Nyomd meg a 1. osszeadasert!");
            System.out.println("Nyomd meg a 2. kivonasert!");
            System.out.println("Nyomd meg a 3. szorzasert!");
            System.out.println("Nyomd meg a 4. osztasert!");
            System.out.println("Nyomd meg a 5. kilepesert!");
            opcio = scanner.nextInt();
            if (opcio == 5) {
                break;
            } else if (opcio == 1) {
                eredmeny = szam1 + szam2;
                System.out.println("Eredmeny:" + eredmeny);
            } else if (opcio == 2) {
                eredmeny = szam1 - szam2;
                System.out.println("Eredemeny:" + eredmeny);
            } else if (opcio == 3) {
                eredmeny = szam1 * szam2;
                System.out.println("Eredmeny:" + eredmeny);
            } else if (opcio == 4) {
                eredmeny = szam1 / szam2;
                System.out.println("Eredmeny:" + eredmeny);
            } else {
                System.out.println("Hibas szamot adtal meg!");
                break;

            }
        }
    }
}