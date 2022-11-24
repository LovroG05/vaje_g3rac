/**
 * Izriše okenčka drugače
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON2 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		izpisiK6();
		izpisiK6();
		izpisiK6();
	}

	static void izpisiK6() {
		int odmik = 1;

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
