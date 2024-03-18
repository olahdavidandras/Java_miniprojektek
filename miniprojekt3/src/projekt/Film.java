package projekt;

import java.util.ArrayList;

interface IKorhataros {
    public int korhatar();

    public int buntetes(int kor);
}

public class Film {
    protected String cim;
    protected int ar;
    protected ArrayList<Integer> velemenyek = new ArrayList<>(20);

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void velemenyezes(int velemeny) {
        if (velemeny >= 1 && velemeny <= 5) {
            velemenyek.add(velemeny);
        } else {
            throw new RuntimeException("1-5 kozott kell legyen az ertekeles!");
        }
    }

    public double atlag() {
        double ossz = 0;
        for (int i : velemenyek) {
            ossz += i;
        }
        if (ossz == 0) {
            throw new RuntimeException("Meg nem kapott ertekelest!");
        }
        return ossz / velemenyek.size();
    }

    @Override
    public String toString() {
        return "Film cime: " +
                cim +
                ", Film ara: " + ar;
    }
}
