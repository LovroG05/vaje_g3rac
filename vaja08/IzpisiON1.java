/**
 * Izriše okenčka
 *
 * @author Jurij Fortuna
 * @version 24. 11. 22
 */
public class IzpisiON1 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			int odmik = 20;

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
}
