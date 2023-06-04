public class Naloga4 {
	public static boolean jeVNizu(String niz, char c) {
		boolean a = true;

		if(niz.indexOf(c) == -1) {
			a = false;
		}

		return a;
	}

	public static boolean jeVNizu(String niz, String podniz) {
		boolean a = true;

		if(niz.indexOf(podniz) == -1) {
			a = false;
		}

		return a;
	}

	public static int poisciVNizu(String niz, String podniz) {
		return niz.charAt(niz.indexOf(podniz));
	}

	public static int prestejVNizu(String niz, char c) {
		int a = 0;
		for(int i = 0; i < niz.length(); i++) {
			if(niz.charAt(i) == c)
				a++;
		}
		return a;
	}

	public static int prestejVNizu(String niz, String podniz) {
		if(niz.contains(podniz)) {
			return 1 + prestejVNizu(niz.replaceFirst(podniz, ""), podniz);
		}

		return 0;
	}
}