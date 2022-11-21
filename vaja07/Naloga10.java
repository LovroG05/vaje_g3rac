/**
 * Narišemo funkcijo y = sin(x)
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
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		for(double x = a; x < b; x += 0.1) {
			int y = (int) Math.toDegrees(Math.sin(x));

			for(int k = 0; k < 60 + y; k++) {
				System.out.print(" ");
			}

			System.out.println(y);
		}
	}
}
