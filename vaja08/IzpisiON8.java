/**
 * Testiranje seštevanje s karakterji in integerji
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON8 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		izracunajVsoto(1, 2); // 3
		izracunajVsoto('1', '2'); // 99
		izracunajVsoto(1, '2'); // 51
		izracunajVsoto('0', 1); // 49
	}

	public static void izracunajVsoto(int a, int b) {
		int vsota = a + b;
		System.out.println(vsota);
	}

    /*
        1. v komentarjih
        2. ACII vrednost karakterja '0' je 48. Zato je potemtakem '0' + n = 48 + n
     */
}
