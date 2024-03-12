import java.util.Arrays;

public class Fel3 {
    public static void main(String[] args) {
        String szo = "ababbcdcaebc";
        String megoldas = "";

        for (int i = 0; i < szo.length(); i++) {
            boolean egyedi = true;
            for (int j = i + 1; j < szo.length(); j++) {
                if (szo.charAt(i) == szo.charAt(j)) {
                    egyedi = false;
                    break;
                }
            }
            if (egyedi == true) {
                megoldas = megoldas + szo.charAt(i);
            }
        }
        char[] veglegesMegoldas = megoldas.toCharArray();
        Arrays.sort(veglegesMegoldas);
        System.out.println(veglegesMegoldas);
    }
}