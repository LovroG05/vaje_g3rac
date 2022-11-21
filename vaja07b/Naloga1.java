/**
 * Izpisuje stvari
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga1 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		char x = 'O';            // je črka O
		final char y = 'A';      // to je konstanta
		x--;
		x--;
		System.out.print(x);
		while(x >= y) {
			x--;
			x--;
			System.out.print(x);
		}
	}
}

/*
- sled izvajanja originala:
    zažene se metoda main
    spremenljivka x tipa char se nastavi na 'o'
    konstanta y tipa char se nastavi na 'A'
    v do whileu se x zmanjša za 2 in izpiše dokler je x večji ali enak y

- Izpiše: "MKIGECA?"
 */