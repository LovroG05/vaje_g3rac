/**
 * Seštevanje z n-členi
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON10 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		izracunajVsoto(1);
		izracunajVsoto(1, 2);
		izracunajVsoto(1, 2, 3);
		izracunajVsoto(1, 2, 3, 4);
		izracunajVsoto(1, 2, 3, 4, 5);
		izracunajVsoto(1, 2, 3, 4, 5, 6);
	}

	static void izracunajVsoto(int... sestevanci) {
		int vsota = 0;

		for(int i : sestevanci) {
			vsota += i;
		}

		System.out.println(vsota);
	}
}
