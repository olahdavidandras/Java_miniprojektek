public class fel6 {
    public static boolean osszehasonlitfuggv(int[] tomb1, int[] tomb2) {
        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tomb1 = {10, 12, 7, 5, -5};
//        int[] tomb2= {10,12,7,5,5};
        int[] tomb2 = {10, 12, 7, 5, -5};
        if (osszehasonlitfuggv(tomb1, tomb2)) {
            System.out.println("Megegyezik a ket tomb!");
        } else {
            System.out.println("Nem egyezik meg a ket tomb!");
        }
    }
}
