import java.util.*;

public class fel7 {
    public static void main(String[] args) {
        String[] tomb = {"1", "1", "2", "2", "0", "3", "33", "3", "3", "1", "2"};
        List<String> megoldas = new ArrayList<>();
        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[i].equals(tomb[j]) && !megoldas.contains(tomb[i])) {
                    megoldas.add(tomb[i]);
                    break;
                }
            }
        }
        System.out.println(megoldas);
    }
}
