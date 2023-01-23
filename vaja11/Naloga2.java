public class Naloga2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        float[] b = {1, 2, 3, 4, 5};

        RacLib.izpisiTabelo(truncToLengh(a, 4));
        RacLib.izpisiTabelo(truncToLengh(b, 4));
    }

    private static int[] truncToLengh(int[] arr, int a) {
        int[] toReturn = new int[a];

        for (int i = 0; i < a; i++) {
            toReturn[i] = arr[i];
        }

        return toReturn;
    }

    private static float[] truncToLengh(float[] arr, int a) {
        float[] toReturn = new float[a];

        for (int i = 0; i < a; i++) {
            toReturn[i] = arr[i];
        }

        return toReturn;
    }
}
