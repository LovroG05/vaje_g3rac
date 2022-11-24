import java.util.Random;

/**
 * Izriše okenčka z naključnim odmikom
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON5 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 35; i++) {
			izpisiKxy(new Random().nextInt(90 - 6) + 6);
		}
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
