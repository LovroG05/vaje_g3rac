import java.util.Arrays;

public class QuickSort {
    public static int start = 0;
    public static int end = Main.tabela.length - 1;

    public static void quickSort(int[] tabela, int start, int end) {

        if (end <= start) return;

        int pivot = partition(tabela, start, end);
        quickSort(tabela, start, pivot - 1);
        quickSort(tabela, pivot + 1, end);

    }

    public static int partition(int[] tabela, int start, int end) {

        int pivot = tabela[end];
        int i = start - 1;

        for (int j = start; j <=  end - 1; j++) {

            if(tabela[j] < pivot) {
                i++;
                int temp = tabela[i];
                tabela[i] = tabela[j];
                tabela[j] = temp;
            }
        }

        i++;
        int temp = tabela[i];
        tabela[i] = tabela[end];
        tabela[end] = temp;

        return i;
    }
}
