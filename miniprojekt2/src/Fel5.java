public class Fel5 {
    public static void main(String[] args) {
        String[] tomb = {"alma", "korte", "banan", "szolo", "avocado", "cipo"};
        if (tomb.length != 0) {
            for (int i = 0; i < tomb.length - 1; i++) {
                tomb[i] = tomb[i + 1];
            }
            tomb[tomb.length - 1] = null;
        }
        if (tomb.length > 1) {
            tomb[tomb.length - 2] = null;

        }
        for (String elem : tomb) {
            if (elem != null) {
                System.out.println(elem);
            }

        }
    }
}
