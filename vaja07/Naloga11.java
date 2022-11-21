/**
 * Rišemo številke v obliki ledene sveče
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga11 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		int vrstic = Integer.parseInt(args[0]);

		for(int i = vrstic; i != 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
