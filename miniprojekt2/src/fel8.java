public class fel8 {
    public static void main(String[] args) {
        int[] tomb = new int[]{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        if (tomb.length != 0) {
            for (int i = 0; i < tomb.length; i++) {
                for (int j = i + 1; j < tomb.length; j++) {
                    int csere = 0;
                    if (tomb[i] > tomb[j]) {
                        csere = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = csere;
                    }
                }
                System.out.println(tomb[i]);
            }
        }
    }
}