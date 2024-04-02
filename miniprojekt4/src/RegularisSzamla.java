import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegularisSzamla implements Bankszamla {

    protected double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    protected static int kovSzamlaSzam = 1;
    protected List<Tranzakcio> tranzakciok;

    public RegularisSzamla(String tulNev) {
        this.tulNev = tulNev;
        this.szamlaSzam = ujSzamlaSzam();
        this.egyenleg = 0.0;
        this.tranzakciok = new ArrayList<>();
    }

    public static int ujSzamlaSzam() {
        Random random = new Random();
        return random.nextInt(1000000, 9999999);
    }

    @Override
    public double getEgyenleg() {

        return egyenleg;
    }

    @Override
    public void betesz(double osszeg) {
        if (osszeg > 0) {
            egyenleg += osszeg;
            Tranzakcio tranz = new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg);
            tranzakciok.add(tranz);

        } else {
            throw new RuntimeException("Hibas osszeg!");
        }
    }

    public List<Tranzakcio> getTranzakciok() {
        return tranzakciok;
    }

    @Override
    public void kivesz(double osszeg) {
        if (egyenleg >= osszeg) {
            egyenleg -= osszeg;
            Tranzakcio tranz = new Tranzakcio(TranzakcioTipus.WITHDRAW, osszeg);
            tranzakciok.add(tranz);
        } else {
            throw new RuntimeException("Hibas osszeg!");
        }
    }

    @Override
    public String toString() {
        return "Szamla szam: " + szamlaSzam +
                ", Tulajdonos neve: " + tulNev +
                ", egyenlege: " + egyenleg +
                ", tranzakciok: " + tranzakciok;
    }
}
