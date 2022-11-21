public class Naloga4 {
	public static void main(String[] args) {
		String a = args[0];
		int i = 0;

		while(i < a.length()) {
			System.out.println(a.charAt(i));
			i++;
		}

		System.out.println();
		i = 0;
		do {
			System.out.println(a.charAt(i));
			i++;
		} while(i < a.length());

		System.out.println();
		for(int j = 0; j < a.length(); j++) {
			System.out.println(a.charAt(j));
		}
	}
}
