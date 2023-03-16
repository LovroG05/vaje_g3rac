import java.util.Arrays;

public class Main {
    public static int numToFind = (int) (Math.random() * 100);
    public static int length = (int) (Math.random() * 100);
    public static int[] tabela = new int[length];

    public static void main(String[] args) {

        for (int i = 0; i < length; i++) {
            tabela[i] = (int) (Math.random() * 100);
        }

        BubbleSort.bubbleSort();
        InsertionSort.insertionSort();
        SelectionSort.selectionSort();

        QuickSort.quickSort(tabela, 0, tabela.length - 1);
        System.out.println(Arrays.toString(tabela));

        if (LinearSearch.linearSearch() != -1) {
            System.out.println("Stevilo " + numToFind + " je na poziciji " + LinearSearch.linearSearch());
        } else {
            System.out.println("Stevila " + numToFind + " ni v tabeli");
        }

        if (BinarySearch.binarySearch() != -1) {
            System.out.println("Stevilo " + numToFind + " je na poziciji " + BinarySearch.binarySearch());
        } else {
            System.out.println("Stevila " + numToFind + " ni v tabeli");
        }

        if (BisectionSearch.bisectionSearch() != -1) {
            System.out.println("Stevilo " + numToFind + " je na poziciji " + BisectionSearch.bisectionSearch());
        } else {
            System.out.println("Stevila " + numToFind + " ni v tabeli");
        }

    }
}