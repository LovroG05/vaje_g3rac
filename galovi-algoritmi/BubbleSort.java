import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort() {

        for (int i = 0; i < Main.tabela.length - 1; i++) {

            for (int j = 0; j < Main.tabela.length - i - 1; j++) {

                if (Main.tabela[j] > Main.tabela[j + 1]) {
                    int temp = Main.tabela[j];
                    Main.tabela[j] = Main.tabela[j + 1];
                    Main.tabela[j + 1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(Main.tabela));

    }
}
