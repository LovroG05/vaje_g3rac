/**
 * Rišemo številke v obliki drugačnega stalagmita
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga14 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
