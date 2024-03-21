package projekt;

import java.util.ArrayList;

public class Teszter {

    public static double buntetes(int eletkor, ArrayList<Film> lista) {
        double buntetesOsszes = 0;
        for (Film film : lista) {
            if (film instanceof IKorhataros) {
                IKorhataros korhatosFilm = (IKorhataros) film;
                buntetesOsszes += korhatosFilm.buntetes(eletkor);
            }
        }
        return buntetesOsszes;
    }

    public static void main(String[] args) {
        Film f1 = new Film("Halaslos Iramban X", 12);
        Film f2 = new Film("Az", 20);
        Film f3 = new Film("Indiana Jones ", 25);
        Film f4 = new Film("2012", 10);
        Film f5 = new Film("Keresztapa", 16);
        Film f6 = new Film("Taxi IV", 21);

        HorrorFilm hf1 = new HorrorFilm("Furesz", 10, 16);
        HorrorFilm hf2 = new HorrorFilm("Fekete telefon", 14, 16);
        HorrorFilm hf3 = new HorrorFilm("Az apaca 2.", 21, 18);
        HorrorFilm hf4 = new HorrorFilm("Frankenstein", 17, 16);
        HorrorFilm hf5 = new HorrorFilm("Demonok kozott", 25, 18);
        HorrorFilm hf6 = new HorrorFilm("Sikoly VI", 15, 16);
        ArrayList<Film> lista = new ArrayList<>();
        ArrayList<IKorhataros> lista2 = new ArrayList<>();

        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        lista.add(f5);
        lista.add(f6);
        lista.add(hf1);
        lista.add(hf2);
        lista.add(hf3);
        lista.add(hf4);
        lista.add(hf5);
        lista.add(hf6);

        for (Film film : lista) {
            System.out.println(film);
        }
        System.out.println();

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).getAr() > lista.get(j + 1).getAr()) {
                    Film temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        for (Film film : lista) {
            System.out.println(film);
        }
        System.out.println();

        for (Film film : lista) {
            if (film instanceof HorrorFilm) {
                lista2.add((HorrorFilm) film);
            }
        }
        for (IKorhataros film : lista2) {
            System.out.println(film);
        }
        System.out.println();

        System.out.println("Buntetes 18 evesre: " + buntetes(18, lista));
        System.out.println("Buntetes 17 evesre: " + buntetes(17, lista));
        System.out.println("Buntetes 16 evesre: " + buntetes(16, lista));
        System.out.println("Buntetes 15 evesre: " + buntetes(15, lista));

    }
}
