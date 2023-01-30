import java.util.Arrays;


public class Naloga4 {
    public static void main(String[] args) {
        int[][][] primerjalna_tabela = new int[3][4][2];

        int[] tabela = RacLib.randomTabela(30);
        primerjalna_tabela[0][0] = vstavljanje(tabela);
        tabela = RacLib.randomTabela(30);
        primerjalna_tabela[0][1] = izbiranje(tabela);
        tabela = RacLib.randomTabela(30);
        primerjalna_tabela[0][2] = mehurcki(tabela);
        tabela = RacLib.randomTabela(30);
        primerjalna_tabela[0][3] = bolsimehurcki(tabela);

        tabela = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        primerjalna_tabela[1][0] = vstavljanje(tabela);
        tabela = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        primerjalna_tabela[1][1] = izbiranje(tabela);
        tabela = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        primerjalna_tabela[1][2] = mehurcki(tabela);
        tabela = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        primerjalna_tabela[1][3] = bolsimehurcki(tabela);

        tabela = new int[]{29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        primerjalna_tabela[2][0] = vstavljanje(tabela);
        tabela = new int[]{29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        primerjalna_tabela[2][1] = izbiranje(tabela);
        tabela = new int[]{29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        primerjalna_tabela[2][2] = mehurcki(tabela);
        tabela = new int[]{29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        primerjalna_tabela[2][3] = bolsimehurcki(tabela);


    }

    public static int[] vstavljanje(int[] tabela) {
        int primerjave = 0;
        int zamenjave = 0;
        int n = tabela.length;
        for (int j = 1; j < n; j++) {
            int key = tabela[j];
            int i = j - 1;
            while ((i > -1) && (tabela[i] > key)) {
                primerjave++;
                zamenjave++;
                tabela[i + 1] = tabela[i];
                i--;
            }
            primerjave++;
            tabela[i + 1] = key;
        }

        return new int[]{primerjave, zamenjave};
    }

    public static int[] izbiranje(int[] tabela) {
        int primerjave = 0;
        int zamenjave = 0;
        int n = tabela.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                primerjave++;
                if (tabela[j] < tabela[min_idx]) {
                    min_idx = j;
                }
            }


            int temp = tabela[min_idx];
            tabela[min_idx] = tabela[i];
            tabela[i] = temp;
            zamenjave++;
        }

        return new int[]{primerjave, zamenjave};
    }

    public static int[] mehurcki(int[] tabela) {
        int primerjave = 0;
        int zamenjave = 0;
        int n = tabela.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                primerjave++;
                if (tabela[j] > tabela[j + 1]) {
                    int temp = tabela[j];
                    tabela[j] = tabela[j + 1];
                    tabela[j + 1] = temp;
                    zamenjave++;
                }
            }
        }

        return new int[]{primerjave, zamenjave};
    }

    public static int[] bolsimehurcki(int[] tabela) {
        int n = tabela.length;
        int primerjave = 0;
        int zamenjave = 0;
        boolean swapPotreben = true;
        for (int i = 0; i < n - 1; i++) {
            swapPotreben = false;
            for (int j = 0; j < n - i - 1; j++) {
                primerjave++;
                if (tabela[j] > tabela[j + 1]) {
                    zamenjave++;
                    int temp = tabela[j];
                    tabela[j] = tabela[j + 1];
                    tabela[j + 1] = temp;
                    swapPotreben = true;
                }
            }
            if (!swapPotreben) break;
        }

        return new int[]{primerjave, zamenjave};
    }
}


