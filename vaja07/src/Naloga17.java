/**
 * Vaja 17
 * @version 1
 * @author lovro
 */
public class Naloga17 {
    /**
     *
     * @param args
     * vstavi število v args
     */
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; ++i) {
            for (int k = n-i; k != 0; k--) {
                System.out.print("  ");
            }
            System.out.print(i);
            for (int k = i*2; k != 0; k--) {
                System.out.print("  ");
            }
            if (i != 0) System.out.print(i);

            System.out.print("\n");
        }
        for (int i = n-2; i >= 0; --i) {
            for (int k = n - i; k != 0; k--) {
                System.out.print("  ");
            }
            System.out.print(i);
            for (int k = i * 2; k != 0; k--) {
                System.out.print("  ");
            }
            if (i != 0) System.out.print(i);

            System.out.print("\n");

        }
    }
}
