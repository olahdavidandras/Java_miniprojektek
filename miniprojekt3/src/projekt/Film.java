package projekt;

import java.util.ArrayList;

interface IKorhataros {
    public int korhatar();

    public int buntetes(int kor);
}

public class Film {
    protected String cim;
    protected int ar;
    protected int[] velemenyek;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
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
        if (velemeny < 1 || velemeny > 5) {
            throw new RuntimeException("1-5 között kell legyen az értékelés!");
        }
        boolean helyTalalva = false;
        for (int i = 0; i < 20; i++) {
            if (velemenyek[i] == 0) {
                velemenyek[i] = velemeny;
                helyTalalva = true;
                break;
            }
        }
        if (!helyTalalva) {
            throw new RuntimeException("A vélemények tömb tele van!");
        }
    }


    public double atlag() {
        double ossz = 0;
        double oszto = 0;
        for (int i : velemenyek) {
            ossz += i;
            if (i != 0) {
                oszto += 1;
            }
        }
        if (ossz == 0) {
            throw new RuntimeException("Meg nem kapott ertekelest!");
        }
        return ossz / oszto;
    }

    @Override
    public String toString() {
        return "Film cime: " +
                cim +
                ", Film ara: " + ar;
    }
}
