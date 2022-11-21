/**
 * Rišemo karo
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga15 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		for(int i = 0; i < a; i++) {
			for(int k = 0; k < 2 * (a - i) - 2; k++) {
				System.out.print(" ");
			}

			for(int j = i; j >= 0; j--) {
				System.out.print(j + " ");
			}

			for(int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		for(int i = a - 1; i >= 0; i--) {
			for(int k = 0; k < 2 * (a - i) - 2; k++) {
				System.out.print(" ");
			}

			for(int j = i; j >= 0; j--) {
				System.out.print(j + " ");
			}

			for(int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
