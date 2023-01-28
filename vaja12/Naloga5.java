public class Naloga5 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 6, 9};

		vsota(a, a);
		razlika(a, a);
		produkt(a, a);
		prikaziStevilo(a);
	}

	private static int vsota(int[] a, int[] b) {
		return tabelaToInt(a) + tabelaToInt(b);
	}

	private static int razlika(int[] a, int[] b) {
		return tabelaToInt(a) - tabelaToInt(b);
	}

	private static int produkt(int[] a, int[] b) {
		return tabelaToInt(a) * tabelaToInt(b);
	}

	private static void prikaziStevilo(int[] a) {
		System.out.println(tabelaToInt(a));
	}

	private static int tabelaToInt(int[] a) {
		String toConvert = "";

		for(int i : a) {
			toConvert += i;
		}

		return Integer.parseInt(toConvert);
	}
}
