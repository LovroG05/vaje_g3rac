/**
 * Menjava klicaje in zvezdice pri izpisu
 *
 * @author Jurij Fortuna
 * @version 21. 11. 22
 */
public class Naloga4 {
	/**
	 * Glavna metoda aplikacije
	 *
	 * @param args parametri iz ukazne vrstice
	 */
	public static void main(String[] args) {
		int i;
		boolean pogoj;

		for(i = 1; i <= 15; i++) {
			pogoj = (i % 4 == 0) || (i % 3 == 0) && (i % 5 == 0);
			//c// pogoj = !pogoj;
			// pogoj = (!pogoj)?!pogoj:pogoj;

			if(pogoj)
				System.out.print('*');
			else
				System.out.print('!');
		}
	}
}

/*
- sled izvajanja:
	i	|	pogoj
	------------------
	1   |   false
	2   |   false
	3   |   false
	4   |   true
	5   |   false
	6   |   false
	7   |   false
	8   |   true
	9   |   false
	10  |   false
	11  |   false
	12  |   true
	13  |   false
	14  |   false
	15  |   true

- Izpiše: !!!*!!!*!!!*!!*
- ! in se zamenjata
- Izpiše ***************
*/