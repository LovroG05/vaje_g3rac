public class Naloga6 {
	public static void main(String[] args) {
		System.out.println(genPalin());
		System.out.println(genPalin(7));
	}

	private static String genPalin() {
		char[] palin = new char[10];

		for(int i = 0; i < palin.length / 2; i++) {
			palin[i] = (char) (Math.random() * 25 + 65);
			palin[palin.length - 1 - i] = palin[i];
		}

		return new String(palin);
	}

	private static String genPalin(int num) {
		char[] palin = new char[num];

		for(int i = 0; i < palin.length; i++) {
			palin[i] = (char) (Math.random() * 25 + 65);
			palin[palin.length - 1 - i] = palin[i];
		}

		return new String(palin);
	}
}