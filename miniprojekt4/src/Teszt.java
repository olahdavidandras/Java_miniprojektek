import java.util.ArrayList;
import java.util.List;

public class Teszt {
    public static void main(String[] args) {
        /** Osztaly peldanyok letrehozas */

        RegularisSzamla r1 = new RegularisSzamla("Kis Janos");
        RegularisSzamla r2 = new RegularisSzamla("Nagy Pista");
        RegularisSzamla r3 = new RegularisSzamla("Nagy Pista");

        FolyoSzamla f1 = new FolyoSzamla("Fazakas Celesztin");
        FolyoSzamla f2 = new FolyoSzamla("Huszar Szabolcs");
        FolyoSzamla f3 = new FolyoSzamla("Huszar Szabolcs");

        TakarekSzamla t1 = new TakarekSzamla("Berei Peter", 100);
        TakarekSzamla t2 = new TakarekSzamla("Csoka Alexander", 50);
        TakarekSzamla t3 = new TakarekSzamla("Csoka Alexander", 50);

        /** Helyes ertekekkel valo teszteles */

        r1.betesz(100);
        r1.kivesz(99);
        r1.betesz(0.1);
        r1.betesz(199.1);
        System.out.println(r1);
        System.out.println();

        f1.betesz(100);
        f1.kivesz(99);
        f1.betesz(0.1);
        System.out.println(f1);
        f1.betesz(50);
        System.out.println(f1);
        f1.levonKoltseg();
        System.out.println(f1);
        System.out.println();

        t1.betesz(100);
        t1.kivesz(99);
        t1.betesz(55.5);
        t1.setKamatRata(10);
        System.out.println(t1.getKamatRata());
        System.out.println(t1);
        t1.hozzaadKamat();
        System.out.println(t1);
        System.out.println();

        /** Equal */

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r1.equals(r1));
        System.out.println();

        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));
        System.out.println(f1.equals(f1));
        System.out.println();

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t1.equals(t1));
        System.out.println();

        /** DEPOSIT listazasa */

        List<Tranzakcio> tranzakciok = r1.getTranzakciok();
        List<Tranzakcio> depozitTranzakciok = new ArrayList<>();
        for (Tranzakcio tranz : tranzakciok) {
            if (tranz.getTranzTipus() == TranzakcioTipus.DEPOSIT) {
                depozitTranzakciok.add(tranz);
            }
        }

        for (Tranzakcio tranz : depozitTranzakciok) {
            System.out.println(tranz);
        }


        /** Hibas ertekekkel valo teszteles */
//        r2.betesz(99);
//        r2.kivesz(100);
//        System.out.println(r2);

//        t2.betesz(100);
//        t2.setKamatRata(-1);
//        System.out.println();;

    }
}
