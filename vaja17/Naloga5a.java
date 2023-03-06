/**
 * @author Jurij Fortuna
 * vir: https://github.com/LovroG05/vaje_g3rac/tree/master/vaja17
 */
public class Naloga5a {
	public static void main(String[] args) {
		int[] ti = new int[10];
		for(int i = 0; i < 10; i++) System.out.println(ti[i]);
		for(int i = 0; i < 10; ti[i] = i * 10, i++) ;
		for(int i = 0; i < 10; i++) System.out.println(ti[i]);
	}
}

// Izpiše prazno tabelo, jo napolni in jo izpiše
