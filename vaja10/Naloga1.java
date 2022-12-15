public class Naloga1 {
	public static void main(String[] args) {
		test01();
	}

	static void test01() {
		int[] tabela;
		tabela = new int[10]; // 10 celih števil

		izpisiTabelo(tabela);

		// prvi je 0 0dmaknjen id začetka; dajmo mu vrednost 122
		System.out.println(tabela[0]);
		tabela[0] = 122;
		System.out.println(tabela[0]);

		// četrti je 3 odmaknjen od začetka: dajmo mu vrednost 777
		System.out.println(tabela[3]);
		tabela[3] = 777;
		System.out.println(tabela[3]);

		int[] tabela2 = {1, 2, 3, 4, 5, 6, 7};
		izpisiTabelo(tabela2);

		// oba skupaj, pa še tista dva vmes :
		System.out.println(tabela[0] + " " + tabela[1] + " " + tabela[2] + " " + tabela[3]);

		// velikost ..
		System.out.println("velikost tabele je " + tabela.length);

		izpisiTabelo(tabela);
	}

	private static void izpisiTabelo(int[] tabela) {
		//iteracija čez vse el. tabele in izpis
		for(int i = 0; i < tabela.length; i++)
			System.out.print(tabela[i] + " ");
		System.out.println();
	}
}

/*
	a)
	b) izpiše prazno tabelo (0 0 0 0 0 0 0 0 0 0 0)
	c)
 */