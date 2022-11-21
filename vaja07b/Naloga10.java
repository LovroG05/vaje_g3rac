import java.util.Random;

/**
 * Naključno izpiše karakterje
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga10 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		Random r = new Random();

		for(int i = 0; i < 15; i++) {
			for(int j = r.nextInt(79); j < 80; j++) {
				System.out.print(" ");
			}

			System.out.print((char) (r.nextInt(122 - 97) + 97));
			System.out.println();
		}
	}
}
