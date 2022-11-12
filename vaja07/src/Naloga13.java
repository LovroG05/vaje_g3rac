/**
 * Vaja 13
 * @version 1
 * @author lovro
 */
public class Naloga13 {
    /**
     *
     * @param args
     * vstavi število v args
     */
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int k = n-i; k != 0; k--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.print("\n");

        }
    }
}