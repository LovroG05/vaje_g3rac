public class Naloga5 {
	public static void main(String[] args) {
		int[] a = Naloga4.ustvariTabInt(RacLib.randomBetween(2, 9), true);
		//int[] a = {1, 2, 3, 4, 4, 3, 5, 6, 7, 1, 2, 4, 3};

		int max = 0;

		for(int i = 0; i < a.length; i++) {
			int b = a[i];

			if(b >= max) {
				max = b;
				System.out.print(max);
			} else {
				max = 0;
				i--;
				System.out.println();
			}
		}
	}
}
