/**
 * Vaja 14
 * @version 1
 * @author lovro
 */
public class Naloga14 {
    /**
     *
     * @param args
     * vstavi število v args
     */
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);

        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            for (int k = n-i; k != 0; k--) {
                System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
