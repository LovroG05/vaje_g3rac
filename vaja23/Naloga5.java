import java.util.Arrays;

public class Naloga5 {
	public static void main(String[] args) {
		System.out.println(genNiz(4, 'A'));
		System.out.println(genNiz(5));
		System.out.println(genNiz('J'));
	}

	private static String genNiz(int num, char lit) {
		char[] letters = new char[num];
		Arrays.fill(letters, lit);

		return new String(letters);
	}

	private static String genNiz(int num) {
		char[] letters = new char[num];

		for(int i = 0; i < num; i++) {
			letters[i] = (char) (Math.random() * 25 + 65);
		}

		return new String(letters);
	}

	private static String genNiz(char lit) {
		int lettersL = (int) (Math.random() * 12 * 4);
		char[] letters = new char[lettersL];
		Arrays.fill(letters, lit);

		return new String(letters);
	}
}
