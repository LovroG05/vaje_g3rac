/**
 * Rišemo karo iz nočnih mor (v sredini je prazen)
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga17 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		for(int i = 0; i < a; i++) {
			for(int j = 0; j < (a - i) * 2 - 2; j++) {
				System.out.print(" ");
			}

			if(i == 0) {
				System.out.println(i);
				continue;
			}

			System.out.print(i);

			for(int k = 0; k < i * 4 - 1; k++) {
				System.out.print(" ");
			}

			System.out.println(i);
		}

		for(int i = a - 2; i >= 0; i--) {
			for(int j = 0; j < (a - i) * 2 - 2; j++) {
				System.out.print(" ");
			}

			if(i == 0) {
				System.out.println(i);
				continue;
			}

			System.out.print(i);

			for(int k = 0; k < i * 4 - 1; k++) {
				System.out.print(" ");
			}

			System.out.println(i);
		}
	}
}
