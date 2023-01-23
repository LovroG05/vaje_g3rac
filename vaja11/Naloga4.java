public class Naloga4 {
    public static void main(String[] args) {
        RacLib.izpisiTabelo(ustvariTabInt(33, true));
        RacLib.izpisiTabelo(ustvariTabInt(1333, false));
    }

    public static int[] ustvariTabInt(int a, boolean random) {
        int[] toReturn = new int[a];

        if (!random) {
            for (int i = 0; i < a; i++) {
                toReturn[i] = i + 1;
            }
        } else {
            for (int i = 0; i < a; i++) {
                toReturn[i] = (int) (Math.random() * 10);
            }
        }

        return toReturn;
    }
}
