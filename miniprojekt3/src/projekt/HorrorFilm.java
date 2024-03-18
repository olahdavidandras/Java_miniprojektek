package projekt;


public class HorrorFilm extends Film implements IKorhataros {
    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;

    }

    @Override
    public int korhatar() {
        return korh;
    }

    @Override
    public int buntetes(int kor) {
        if (kor - korh < 0) {
            return Math.abs(kor - korh) * ar;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Film cime: " +
                cim +
                ", Film ara: " + ar +
                ", Film korhatara: " + korh;
    }
}
