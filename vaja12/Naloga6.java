import java.util.Arrays;

public class Naloga6 {
	public static void main(String[] args) {
		int[] streli = new int[100];

		for(int i = 0; i < streli.length; i++) {
			streli[i] = RacLib.randomBetween(0, 11);
		}

		System.out.println(Arrays.toString(dolociPovprecjeSerij(streli)));
	}

	private static int[] dolociPovprecjeSerij(int[] a) {
		int[] toReturn = new int[10];
		int toReturnPointer = 0;

		for(int i = 0; i < a.length; i += 10) {
			int rez = 0;

			for(int j = 0; j < 10; j++) {
				rez += a[i + j];
			}

			toReturn[toReturnPointer] = rez / 10;
			toReturnPointer++;
		}

		return toReturn;
	}
}
