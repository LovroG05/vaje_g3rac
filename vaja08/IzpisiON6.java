/**
 * Testiranje identifikatorjov metod
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON6 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		izracunajVsoto(1, 2);
		izracunajVsoto2();
	}

	public static void izracunajVsoto(int a, int b) {
		int vsota = a + b;
		System.out.println(vsota);
	}

	public static void izracunajVsoto2() {
		int a = 1;
		int b = 2;

		int vsota = a + b;
		System.out.println(vsota);
	}
}
