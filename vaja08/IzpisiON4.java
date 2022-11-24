/**
 * Izriše okenčka še malo bolj malo drugače
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON4 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		izpisiKxy(6);
		izpisiKxy(13);
		izpisiKxy(20);
	}

	static void izpisiKxy(int odmik) {
		System.out.printf("%" + odmik + "s", " ");
		System.out.println("******");
		System.out.printf("%" + odmik + "s", " ");
		System.out.println("*    *");
		System.out.printf("%" + odmik + "s", " ");
		System.out.println("* ** *");
		System.out.printf("%" + odmik + "s", " ");
		System.out.println("* ** *");
		System.out.printf("%" + odmik + "s", " ");
		System.out.println("*    *");
		System.out.printf("%" + odmik + "s", " ");
		System.out.println("******");
		System.out.println("");

	}
}
