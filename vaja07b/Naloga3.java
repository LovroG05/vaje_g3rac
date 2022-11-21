/**
 * Išče večkratnike števila
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga3 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int večkratniki = 0;
		for(int i = 0; i < 50; i++) {
			int r = (int) (Math.random() * (30 - 5 + 1) + 5);
			if(r % n == 0) {
				večkratniki++;
			}
		}
		System.out.printf("Najdenih je bilo %d večkratnikov števila %d", večkratniki, n);
	}
}
