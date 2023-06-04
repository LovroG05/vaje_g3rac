public class Naloga10 {
	public static void main(String[] args) {
		String[] t = new String[10];

		generirajNizeVTabelo(t);
		izpisiTabeloNizov(t);
	}

	public static String[] generirajNizeVTabelo(String[] vrni) {
		String a = "";

		for(int i = 0; i < 10; i++) {
			switch((int) (Math.random() * 9)) {
				case 1 -> a = Naloga9.generirajNizCrke(10);
				case 2 -> a = Naloga9.generirajNizCrkeInStevilke(10);
				case 3 -> a = Naloga9.generirajNizStevilke(10);
				case 4 -> a = Naloga9.generirajNizCrkeVelike(10);
				case 5 -> a = Naloga9.generirajNizCrkeMale(10);
				case 6 -> a = Naloga9.generirajNizZnaki(10);
			}

			vrni[i] = a;
		}

		return vrni;
	}

	public static void izpisiTabeloNizov(String[] t) {
		for(int i = 0; i < 10; i++) {
			System.out.println(t[i]);
		}
	}
}
