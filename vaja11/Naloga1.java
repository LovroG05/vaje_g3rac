public class Naloga1 {
    static int[] vh1 = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8, 9};
    static int[] vh2 = new int[60];

    public static void main(String[] args) {
        izpisi2(vh1);
        izpisi2(vh2);
    }

    private static void izpisi2(int[] tab) {
        // Preštejmo lihe in sode
        int lihe = 0;
        int sode = 0;

        for (int j : tab) {
            if (j % 2 == 0) {
                sode++;
            } else {
                lihe++;
            }
        }

        int[] rezLihe = new int[lihe];
        int[] rezSode = new int[sode];

        int lihaPointer = 0;
        int sodaPointer = 0;

        for (int j : tab) {
            if (j % 2 == 0) {
                rezSode[sodaPointer] = j;
                sodaPointer++;
            } else {
                rezLihe[lihaPointer] = j;
                lihaPointer++;
            }
        }

        RacLib.izpisiTabelo("Inicialna tabela: ", tab);
        RacLib.izpisiTabelo("Soda tabela: ", rezSode);
        RacLib.izpisiTabelo("Liha tabela: ", rezLihe);

        System.out.println();
    }
}