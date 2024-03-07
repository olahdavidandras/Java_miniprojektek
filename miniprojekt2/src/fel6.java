public class fel6 {
    /* lk= legkisebb szam
    ln= legnagyobb szam
     */
    public static void main(String[] args) {
        int[] tomb = new int[]{1, 232, 7, -12, 0, 23, 78, -1};
        if (tomb.length != 0) {
            int ln = tomb[0], lk = tomb[0];
            for (int i : tomb) {
                if (i < lk) {
                    lk = i;
                }
                if (i > ln) {
                    ln = i;
                }
            }
            System.out.println("Legkisebb: " + lk + " Legnagyobb: " + ln);
        }
    }
}
