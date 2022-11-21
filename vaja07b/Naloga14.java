/**
 * Riše mazohistični diamant; naloga vzeta iz strašnega gozda Sneguljčice
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
		int višina = Integer.parseInt(args[2]);
		int višina1 = višina + 2;
		int širina1 = višina1 * 3;

		String k = args[1];

		for(int i = 0; i < širina1; ++i) {
			System.out.print(k);
		}
		System.out.println("");

		for(int i = 1; i <= ((višina / 2) + 1); ++i) {
			int charnausakistrani = (širina1 / 2 - i) + 1;
			for(int j = 0; j < charnausakistrani; ++j) {
				System.out.print(k);
			}

			for(int j = 0; j < (širina1 - (charnausakistrani * 2)); ++j) {
				System.out.print(" ");
			}

			for(int j = 0; j < charnausakistrani; ++j) {
				System.out.print(k);
			}
			System.out.println("");
		}

		for(int i = višina / 2; i > 0; --i) {
			int charnausakistrani = (širina1 / 2 - i) + 1;
			for(int j = 0; j < charnausakistrani; ++j) {
				System.out.print(k);
			}

			for(int j = 0; j < (širina1 - (charnausakistrani * 2)); ++j) {
				System.out.print(" ");
			}

			for(int j = 0; j < charnausakistrani; ++j) {
				System.out.print(k);
			}
			System.out.println("");
		}

		for(int i = 0; i < širina1; ++i) {
			System.out.print(k);
		}
		System.out.println("");
	}
}
