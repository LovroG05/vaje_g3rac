public class Naloga6 {
	public static void main(String[] args) {
		String original = "1234567891";
		String brisan = "1";
	}

	public static String brisiPrvoPojavitevNiza(String original, String brisan) {
		return original.replaceFirst(brisan, "");
	}

	public static String brisiZadnjoPojavitevNiza(String original, String brisan) {
		return original.substring(0, original.lastIndexOf(brisan)) + original.substring(original.lastIndexOf(brisan) + brisan.length(), original.length());
	}

	public static String brisiVsePojavitveNiza(String original, String brisan) {
		return original.replaceAll(brisan, "");
	}

	public String vrniPrvoPolovicoNiza(String original) {
		return original.substring(0, original.length() / 2);
	}

	public String vrniZadnjoPolovicoNiza(String original) {
		return original.substring(original.length() / 2, original.length());
	}

	public String vrniSrednjoTretjinoNiza(String original) {
		return original.substring(original.length() / 3, original.length() / 3 * 2);
	}

	public String vrniZadnjihNZnakovNiza(String original, int a) {
		return original.substring(original.length() - a, original.length());
	}
}
