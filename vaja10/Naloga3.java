public class Naloga3 {
	public static void main(String[] args) {
		test03();
		test03('b');
		System.out.println(test03gt('l'));
	}

	/**
	 * alternativa k test02/0 iz naloge 2, skušajte klicati ...
	 */
	static void test03() {
		char[] tabchar = {'a', 'l', 'i', 'b', 'a', 'b', 'a'};
		int stevec = 0;

		System.out.println("Dana tabela vsebuje " + tabchar.length + " znakov.");
		System.out.print("... in notri je ");

		for(int i = 0; i < tabchar.length; i++)
			if(tabchar[i] == 'a')
				stevec++;
		System.out.println(stevec + " a-jev");
	}

	static void test03(char primerjava) {
		char[] tabchar = {'a', 'l', 'i', 'b', 'a', 'b', 'a'};
		int stevec = 0;

		System.out.println("Dana tabela vsebuje " + tabchar.length + " znakov.");
		System.out.print("... in notri je ");

		for(int i = 0; i < tabchar.length; i++)
			if(tabchar[i] == primerjava)
				stevec++;
		System.out.println(stevec + " " + primerjava + "-jev");
	}

	static int test03gt(char primerjava) {
		char[] tabchar = {'a', 'l', 'i', 'b', 'a', 'b', 'a'};
		int stevec = 0;

		for(int i = 0; i < tabchar.length; i++)
			if(tabchar[i] == primerjava)
				stevec++;

		return stevec;
	}
}