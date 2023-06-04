public class Naloga11 {
	public static void main(String[] args) {
		String[] t = {"pablik", "statik", "vojid", "mejn"};

		System.out.println(aliJeVTabeliNiz(t, "lmao"));
		System.out.println(vrniNajkrajsiNizVTabeli(t));
		System.out.println(vrniNajdaljsiNizVTabeli(t));
		System.out.println(vrniNajmanjsiNizVTabeli(t));
		System.out.println(vrniNajvecjiNizVTabeli(t));
		System.out.println(aliTabelaNizovVsebujeDuplikate(t));
		System.out.println(vrniPrviDupliciranNizVTabeliNizov(t));
	}

	public static boolean aliJeVTabeliNiz(String[] t, String niz) {
		boolean a = false;

		for(int i = 0; i < t.length; i++) {
			if(t[i].contains(niz)) {
				return a = true;
			}
		}

		return a;
	}

	public static String vrniNajkrajsiNizVTabeli(String[] t) {
		int a = 0, b = 0;

		for(int i = 0; i < t.length; i++) {
			if(a < t[i].length()) {
				a = t[i].length();
				b = i;
			}
		}

		return t[b];
	}

	public static String vrniNajdaljsiNizVTabeli(String[] t) {
		int a = t[0].length(), b = 0;

		for(int i = 0; i < t.length; i++) {
			if(a > t[i].length()) {
				a = t[i].length();
				b = i;
			}
		}

		return t[b];
	}

	public static String vrniNajmanjsiNizVTabeli(String[] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = i + 1; j < t.length; j++) {
				if(t[i].compareTo(t[j]) > 0) {
					String temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}

		return t[0];
	}

	public static String vrniNajvecjiNizVTabeli(String[] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = i + 1; j < t.length; j++) {
				if(t[i].compareTo(t[j]) > 0) {
					String temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}

		return t[t.length - 1];
	}

	public static boolean aliTabelaNizovVsebujeDuplikate(String[] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = i + 1; j < t.length; j++) {
				if(t[i].compareTo(t[j]) == 0) {
					return true;
				}
			}
		}

		return false;
	}

	public static String vrniPrviDupliciranNizVTabeliNizov(String[] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = i + 1; j < t.length; j++) {
				if(t[i].compareTo(t[j]) == 0) {
					return t[i];
				}
			}
		}

		return "ni dvojnih nizov";
	}
}
