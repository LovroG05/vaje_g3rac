import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Jurij Fortuna
 * vir: https://github.com/LovroG05/vaje_g3rac/tree/master/vaja17
 */
public class Naloga3 {
	public static Scanner rsc;
	public static Random rrd;
	public static int[] rti;

	public static void main(String[] args) {
		rsc = new java.util.Scanner("10 20 30 40 50 90");
		rti = new int[10];
		int cst = 100;

		// b
		rti = new int[]{1200, 1300, 1400};

		// c1
		System.out.println(Arrays.toString(rti));

		// c2
		while(rsc.hasNext()) {
			System.out.println(rsc.nextInt());
		}

		// d
		rrd = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.println(rrd.nextInt());
		}
	}
}