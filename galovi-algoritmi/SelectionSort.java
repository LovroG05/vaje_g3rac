import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort() {

        for (int i = 0; i < Main.tabela.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < Main.tabela.length; j++) {

                if (Main.tabela[j] < Main.tabela[min]) {
                    min = j;
                }

            }

            int temp = Main.tabela[i];
            Main.tabela[i] = Main.tabela[min];
            Main.tabela[min] = temp;

        }

        System.out.println(Arrays.toString(Main.tabela));

    }
}
