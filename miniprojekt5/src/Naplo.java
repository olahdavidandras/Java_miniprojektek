import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Naplo {
    protected ArrayList<Hallgato> hallgatok;

    public Naplo(String filename) throws FileNotFoundException {
        this.hallgatok = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String surname = parts[0];
                String forename = parts[1];
                Hallgato hallgato = new Hallgato(surname, forename);
                hallgatok.add(hallgato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listazNevek() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getID() + ". " + hallgato.getSurname() + " " + hallgato.getForename());
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        for (Hallgato hallgato : hallgatok) {
            if (hallgato.getID() == ID) {
                hallgato.ujBejegyzes(jegy);
            }
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getSurname() + " " + hallgato.getForename());
            ArrayList<String> courses = hallgato.getTantargyak();
            for (String course : courses) {
                double average = hallgato.tantargyAtlag(course);
                System.out.println(course + ": " + average);
            }
            System.out.println();
        }
    }

}
