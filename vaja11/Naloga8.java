import java.util.Arrays;

public class Naloga8 {
	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(
						zlij(
								new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9},
								new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}
						)
				)
		);
	}

	private static int[] zlij(int[] a, int[] b) {
		int[] toReturn = new int[a.length + b.length];

		for(int i = 0; i < toReturn.length / 2; i++) {
			toReturn[i * 2] = a[i];
			toReturn[i * 2 + 1] = b[i];
		}

		return toReturn;
	}
}
