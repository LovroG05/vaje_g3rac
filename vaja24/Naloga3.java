public class Naloga3 {
	public static void main(String[] args) {
		String niz = "123456789";

		izpisPrviZadni(niz);
		System.out.println(vrniPrviZadni(niz));
	}

	public static void izpisPrviZadni(String niz) {
		System.out.println(niz.charAt(0));
		System.out.println(niz.charAt(1));
		System.out.println(niz.charAt(niz.length() - 2));
		System.out.println(niz.charAt(niz.length() - 1));
	}

	public static String vrniPrviZadni(String niz) {
		return (String.valueOf(niz.charAt(0)) + niz.charAt(1) + niz.charAt(niz.length() - 2) + niz.charAt(niz.length() - 1));
	}
}