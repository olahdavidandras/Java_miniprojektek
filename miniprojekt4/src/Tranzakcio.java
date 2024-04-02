import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum TranzakcioTipus {
    DEPOSIT,
    WITHDRAW
}

public class Tranzakcio {
    protected LocalDateTime idopont;
    protected TranzakcioTipus tranzTipus;
    protected double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    public TranzakcioTipus getTranzTipus() {
        return tranzTipus;
    }

    @Override
    public String toString() {
        return "Tranzakcio tipusa: " + tranzTipus +
                ", osszeg: " + osszeg +
                ", idopont: " +
                idopont.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

}
