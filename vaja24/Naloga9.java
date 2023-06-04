public class Naloga9 {
	public static String generirajNizCrke(int dolzinaNiza) {
		String toReturn = "";

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((int) (Math.random() * 65) + 25);
		}

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((int) (Math.random() * 97 + 25));
		}

		return toReturn;
	}

	public static String generirajNizCrkeInStevilke(int dolzinaNiza) {
		String toReturn = "";

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((int) (Math.random() * 65) + 25);
		}

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((int) (Math.random() * 97 + 25));
		}

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += ((int) (Math.random() * 9));
		}
		return toReturn;
	}

	public static String generirajNizStevilke(int dolzinaNiza) {
		String toReturn = "";

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((Math.random() * 9));
		}

		return toReturn;
	}

	public static String generirajNizCrkeVelike(int dolzinaNiza) {
		String toReturn = "";

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((Math.random() * 65) + 25);
		}

		return toReturn;
	}

	public static String generirajNizCrkeMale(int dolzinaNiza) {
		String toReturn = "";

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((Math.random() * 97) + 25);
		}

		return toReturn;
	}

	public static String generirajNizZnaki(int dolzinaNiza) {
		String toReturn = "";

		for(int i = 0; i < dolzinaNiza; i++) {
			toReturn += (char) ((Math.random() * 94) + 33);
		}

		return toReturn;
	}
}
