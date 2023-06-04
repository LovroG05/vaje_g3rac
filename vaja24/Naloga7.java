public class Naloga7 {
	public static void main(String[] args) {
	}

	public static String zamenjajPrviNizZPodnizom(String niz, String osnovni, String novi) {
		return niz.replace(osnovni, novi);
	}

	public static String zamenjajZadnjiNizZPodnizom(String niz, String osnovni, String novi) {
		return niz.substring(0, niz.lastIndexOf(osnovni)) + novi + niz.substring(niz.lastIndexOf(osnovni) + osnovni.length(), niz.length());
	}

	public static String zamenjajVseNizeZPodnizom(String niz, String osnovni, String novi) {
		return niz.replaceAll(osnovni, novi);
	}
}
