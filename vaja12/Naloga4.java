import java.util.Arrays;

public class Naloga4 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 4, 3, 5, 6, 7, 1, 2, 4, 3};

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(obrniPodzaporedjeVDaniTabeli(a, 0, 6)));
	}

	private static int[] obrniPodzaporedjeVDaniTabeli(int[] a, int start, int end) {
		if(start > end || start > a.length - 1 || end > a.length - 1) {
			return null;
		}

		int[] toReturn = new int[end - start];

		for(int i = 0; i < end - start; i++) {
			toReturn[i] = a[start + i];
		}

		return RacLib.zrcaliTabelo(toReturn);
	}
}
