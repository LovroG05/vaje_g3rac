import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort() {

        for (int i = 1; i < Main.tabela.length; i++) {

            int temp = Main.tabela[i];
            int j = i - 1;

            while (j >= 0 && Main.tabela[j] > temp) {

                Main.tabela[j + 1] = Main.tabela[j];
                j--;

            }

            Main.tabela[j + 1] = temp;

        }

        System.out.println(Arrays.toString(Main.tabela));

    }
}
