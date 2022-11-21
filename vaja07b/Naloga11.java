/**
 * Program izriše okvir
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga11 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String args[]) {
		System.out.print("+");
		for(int i = 0; i != 78; i++) {
			System.out.print("-");
		}
		System.out.println("+");
		for(int j = 0; j != 23; j++) {
			System.out.print("|");
			for(int k = 0; k != 78; k++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
		System.out.print("+");
		for(int i = 0; i != 78; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
