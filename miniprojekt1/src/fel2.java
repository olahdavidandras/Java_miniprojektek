import java.util.Objects;
import java.util.concurrent.TransferQueue;
import java.util.Scanner;

public class fel2 {

    static int jelszoellenorzo(String jelszotipp) {
        String jelszo = "Sapientia2023";
        if (Objects.equals(jelszotipp, jelszo)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int probaszam = 0;
        System.out.println("Add meg a jelszot!");
        Scanner scanner = new Scanner(System.in);
        String probalkozasjelszo = scanner.next();
        for (int i = 0; i < 2; i++) {

            if (jelszoellenorzo(probalkozasjelszo) == 1) {
                System.out.println("Helyes jelszo!");
                probaszam++;
                break;
            } else {
                System.out.println("Hibas jelszo, probald ujra!");
                probalkozasjelszo = scanner.next();
            }
        }
        if (probaszam == 0) {
            System.out.println("Nem talaltad el egyszer se a jelszot!");
        }
        scanner.close();
    }
}
