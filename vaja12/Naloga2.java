public class Naloga2 {
	public static void main(String[] args) {
		pofarbi(5);
	}

	private static void pofarbi(int n) {
		int[] tab = new int[20];
		char[] barve = {'r', 'g', 'b', 'y'};

		for(int i = 0; i < tab.length; i++) {
			System.out.print(barve[(i / n) % 4]);
		}
	}
}
