import java.util.Arrays;

public class Naloga7 {
	public static void main(String[] args) {
		int[] a = RacLib.FOO;
		int krit = 3;

		int tr1Size = 0;
		int tr2Size = 0;

		for(int j : a) {
			if(j <= krit) {
				tr1Size++;
			} else {
				tr2Size++;
			}
		}

		int[] tr1 = new int[tr1Size];
		int[] tr2 = new int[tr2Size];

		razdeli(a, 3, tr1, tr2);

		System.out.println(Arrays.toString(tr1));
		System.out.println(Arrays.toString(tr2));
	}

	private static void razdeli(int[] t1, int krit, int[] tr1, int[] tr2) {
		int tr1Pointer = 0;
		int tr2Pointer = 0;

		for(int j : t1) {
			if(j <= krit) {
				tr1[tr1Pointer] = j;
				tr1Pointer++;
			} else {
				tr2[tr2Pointer] = j;
				tr2Pointer++;
			}
		}
	}
}
