import java.util.Arrays;


public class Naloga2 {
    public static void main(String[] args) {
        int[] tabela = {9, 2, 6, 1, 4, 8, 5, 0, 3, 7};
        vstavljanje(tabela);
        System.out.println(Arrays.toString(tabela));
        tabela = new int[]{9, 2, 6, 1, 4, 8, 5, 0, 3, 7};
        izbiranje(tabela);
        System.out.println(Arrays.toString(tabela));
        tabela = new int[]{9, 2, 6, 1, 4, 8, 5, 0, 3, 7};
        mehurcki(tabela);
        System.out.println(Arrays.toString(tabela));
        tabela = new int[]{9, 2, 6, 1, 4, 8, 5, 0, 3, 7};
        bolsimehurcki(tabela);
        System.out.println(Arrays.toString(tabela));
    }

    public static void vstavljanje(int[] tabela) {
        int primerjave = 0;
        int n = tabela.length;
        for (int j = 1; j < n; j++) {
            int key = tabela[j];
            int i = j - 1;
            while ((i > -1) && (tabela[i] > key)) {
                primerjave++;
                tabela[i + 1] = tabela[i];
                i--;
            }
            primerjave++;
            tabela[i + 1] = key;
        }

        System.out.println("št. primerjav: " + primerjave);
    }

    public static void izbiranje(int[] tabela) {
        int primerjave = 0;
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
        }

        System.out.println("št. primerjav: " + primerjave);
    }

    public static void mehurcki(int[] tabela) {
        int primerjave = 0;
        int n = tabela.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                primerjave++;
                if (tabela[j] > tabela[j + 1]) {
                    int temp = tabela[j];
                    tabela[j] = tabela[j + 1];
                    tabela[j + 1] = temp;
                }
            }
        }

        System.out.println("št. primerjav: " + primerjave);
    }

    public static void bolsimehurcki(int[] tabela) {
        int n = tabela.length;
        int primerjave = 0;
        boolean swapPotreben = true;
        for (int i = 0; i < n - 1; i++) {
            swapPotreben = false;
            for (int j = 0; j < n - i - 1; j++) {
                primerjave++;
                if (tabela[j] > tabela[j + 1]) {
                    int temp = tabela[j];
                    tabela[j] = tabela[j + 1];
                    tabela[j + 1] = temp;
                    swapPotreben = true;
                }
            }
            if (!swapPotreben) break;
        }

        System.out.println("št. primerjav: " + primerjave);
    }
}

