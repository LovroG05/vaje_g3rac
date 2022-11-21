/**
 * Rišemo številke v obliki drugačne ledene sveče
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga12 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		int vrstic = Integer.parseInt(args[0]);

		for(int i = 0; i < vrstic; i++) {
			for(int k = 0; k < i * 2; k++) {
				System.out.print(" ");
			}

			for(int j = vrstic - 1 - i; j >= 0; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
