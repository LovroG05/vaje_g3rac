/**
 * @author Jurij Fortuna
 * vir: https://github.com/LovroG05/vaje_g3rac/tree/master/vaja17
 */
public class Naloga8 {
	public static void main(String[] args) {
		String[] ts = new String[3];                        // deklaracija tabele; ustvari 5 referenc na nize (ki jih še ni)
		ts[0] = new String("1 2 3 4 5");           // ustvarimo prvi niz
		ts[1] = "11 12 13 14 15 16";               // drugi niz, poenostavljeno pa enakovredno
		ts[2] = new String("21 22 23 24 25 26 27");

		int a = 5;
		for(int i = 0; i < a; i += 1) {
			for(String s : ts) {
				String[] temp = s.split(" ");
				System.out.print(temp[i] + " ");
			}

			System.out.println();
		}
	}
}
