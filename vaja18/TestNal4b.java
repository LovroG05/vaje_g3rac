public class TestNal4b {
	private static final Naloga3[] tocke = new Naloga3[9];

	public static void main(String[] args) {
		for(int i = 0; i < tocke.length; i++) {
			Naloga3 tocka = new Naloga3();
			tocka.tocka[0] = i;
			tocka.tocka[1] = i;

			tocke[i] = tocka;
			tocka.izpisiTocko();
		}

		System.out.println("\n");

		for(Naloga3 tocka : tocke) {
			tocka.tocka[0] += 2;
			tocka.tocka[1] += 2;

			tocka.izpisiTocko();
		}
	}
}

/*
	- Naloga 4b je manj kompleksna in mazohistična, saj lahko priredimo vektor celemu arrayu z eno zanko
 */