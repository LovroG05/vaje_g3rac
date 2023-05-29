public class Naloga4 {
	public static void main(String[] args) {
		char[] tab = new char[25];
		tab[0] = (char) (Math.random() * 25 + 65);

		for(int i = 1; i < tab.length; i++) {
			tab[i] = (char) (Math.random() * 25 + 97);
		}

		System.out.println(new String(tab));
	}
}