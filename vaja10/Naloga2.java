public class Naloga2 {
	public static void main(String[] args) {
		test02();
	}

	static void test02() {
		char[] tabchar = {'a', 'l', 'i', 'b', 'a', 'b', 'a'};
		System.out.println("alibaba ima " + tabchar.length + " crk.");
		System.out.print("... in notri je ");

		System.out.print(prestejCrke(tabchar, 'a') + " a-jev");
	}

	private static int prestejCrke(char[] tabchar, char iskanaCrka) {
		int stevec = 0;

		for(int i = 0; i < tabchar.length; i++)
			if(tabchar[i] == iskanaCrka)
				stevec++;

		return stevec;
	}
}

/*
	a) metodi je manjkala deklaracija spremenljivke stevec
	b)
 */