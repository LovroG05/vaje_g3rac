public class Naloga7 {
	public static void main(String[] args) {
		String niz1 = "123456789";
		String niz2 = "123456789";
		Niz niz3 = new Niz("123456789");

		System.out.println(primerjaj(niz1, niz2));
		System.out.println(niz3.primerjaj(niz2));
	}

	private static int primerjaj(String niz1, String niz2) {
		if(niz1.length() != niz2.length()) {
			if(niz1.length() > niz2.length()) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}
}
