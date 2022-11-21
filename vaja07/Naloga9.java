/**
 * Tabeliramo funkcijo y = sin(x)
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga9 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		System.out.printf("%5s | y\n", "x");
		System.out.println("-------------");

		for(double x = -Math.PI / 4; x < Math.PI; x += 1d / 10d) {
			System.out.printf("%5.2f | %5.2f\n", x, Math.sin(x));
		}
	}
}