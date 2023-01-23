public class Naloga3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        RacLib.izpisiTabelo("Začetna tabela: ", a);
        RacLib.izpisiTabelo("Končna tabela: ", nastaviZacetneKoncne(a, 2, 0));
    }

    private static int[] nastaviZacetneKoncne(int[] arr, int x, int v) {
        for (int i = 0; i < x; i++) {
            arr[i] = v;
            arr[arr.length - 1 - i] = v;
        }

        return arr;
    }
}
