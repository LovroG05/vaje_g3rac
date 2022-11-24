/**
 * Testiranje overloadanja metod
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON9 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		izracunajVsoto('0', '1'); // 1
		izracunajVsoto('1', '2'); // 3
		izracunajVsoto('3', '4'); // 7


		izracunajVsoto('2', 4); // 54
		izracunajVsoto(2, '4'); // 54
	}

	public static void izracunajVsoto(int a, int b) {
		int vsota = a + b;
		System.out.println(vsota);
	}

	static void izracunajVsoto(char a, char b) {
		int vsota = a + b - 2 * 48;
		System.out.println(vsota);
	}


    /*
        - Rezultati izracunajVsoto(char a, char b) so v komentarjih
        - Rezultati ambigious klicov so tudi v komentarjih
            logično se je klicala metoda izracunajVsoto(int a, int b), saj se metoda izracunajVsoto(char a, char b) kliče
            samo, ko sta parametra a && b tipa char
     */
}
