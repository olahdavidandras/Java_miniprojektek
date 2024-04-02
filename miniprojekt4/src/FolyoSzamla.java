import java.util.Objects;

public class FolyoSzamla extends RegularisSzamla {

    protected int tranzakciokSzama;
    protected static int ingyenesTranzakciokSzama = 3;
    protected static double tranzakcioAra = 2;


    public FolyoSzamla(String tulNev) {
        super(tulNev);
        this.tranzakciokSzama = 0;
    }

    @Override
    public void betesz(double osszeg) {
        tranzakciokSzama++;
        super.betesz(osszeg);
    }

    @Override
    public void kivesz(double osszeg) {
        tranzakciokSzama++;
        super.kivesz(osszeg);
    }

    public void levonKoltseg() {
        if (tranzakciokSzama > ingyenesTranzakciokSzama) {
            double levonOsszeg = tranzakcioAra * (tranzakciokSzama - ingyenesTranzakciokSzama);
            egyenleg -= levonOsszeg;
        }
        tranzakciokSzama = 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tranzakciokSzama: " + tranzakciokSzama;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof FolyoSzamla that)) return false;
        return Objects.equals(tulNev, that.tulNev) && Objects.equals(tranzakciokSzama, that.tranzakciokSzama) && Objects.equals(szamlaSzam, that.szamlaSzam);
    }
}


