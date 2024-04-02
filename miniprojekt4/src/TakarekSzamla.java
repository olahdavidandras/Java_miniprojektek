import java.util.Objects;

public class TakarekSzamla extends RegularisSzamla {

    protected double kamatRata;
    protected double kamat;

    public TakarekSzamla(String tulNev, double kamat) {
        super(tulNev);
        this.kamat = kamat;
    }

    public void hozzaadKamat() {
        egyenleg += egyenleg * kamatRata / 100;
    }

    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamat) {
        if (kamat >= 0) {
            this.kamatRata = kamat;
        } else {
            throw new RuntimeException("Nem lehet negativ kamat!");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", kamatrata: " + kamatRata;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TakarekSzamla that)) return false;
        return Objects.equals(tulNev, that.tulNev) && Objects.equals(kamatRata, that.kamatRata) && Objects.equals(szamlaSzam, that.szamlaSzam);
    }
}
