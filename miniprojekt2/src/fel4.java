public class fel4 {
    public static void main(String[] args) {
        String szo = "aaabbbcccdde";
        String megoldas = "";
        int szamlalo = 1;
        if (szo.length() != 0) {
            char betu = szo.charAt(0);
            for (int i = 1; i < szo.length(); i++) {
                if (szo.charAt(i) == betu) {
                    szamlalo++;
                } else {
                    megoldas += betu;
                    megoldas += szamlalo;
                    betu = szo.charAt(i);
                    szamlalo = 1;
                }
            }
            megoldas += betu;
            megoldas += szamlalo;
            System.out.println(megoldas);
        }
    }
}
