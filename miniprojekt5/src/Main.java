import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes(new Jegy("Matek", 10));

        hallgato.ujBejegyzes(new Jegy("Matek", 8));
        hallgato.ujBejegyzes(new Jegy("Roman", 7));
        hallgato.ujBejegyzes(new Jegy("Roman", 8));
        hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        hallgato.listazas();
        System.out.println("------------------------------");

        Naplo naplo = new Naplo("hallgatok.csv");
        naplo.listazNevek();
        System.out.println("------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader("jegyek.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int ID = Integer.parseInt(parts[0]);
                String tantargy = parts[1];
                int grade = Integer.parseInt(parts[2]);
                Jegy gradeObj = new Jegy(tantargy, grade);
                naplo.ujJegy(ID, gradeObj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        naplo.listazHallgatoiAdatok();
    }
}
