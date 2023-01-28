import java.util.Arrays;

import static java.util.Arrays.sort;

public class Naloga2 {
    public static void main(String[] args) {
        int[]t=new int[]{1,2,3,5,1,7,8,9};
        System.out.println(Arrays.toString(t));
        sort(t);
        System.out.println(Arrays.toString(t));


        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = new int [] {1, 2, 3, 4};
        int[] arr3 = new int [] {1, 2, 4, 3};

        System.out.println("je arr1 enak arr2 : " +
                Arrays.equals(arr1, arr2));
        System.out.println("je arr1 enak arr3 : " +
                Arrays.equals(arr1, arr3));

        // metoda Arrays.equals/2 primerja 2 zaporedji in vrne true če sta enaki
    }

    public boolean enakiTab(int[] t1, int[] t2) {
        return t1 == t2;
    }
}
