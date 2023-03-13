public class Rv3b {
	public static void main(String[] args) {
		Naloga1 t1, t2;
		t1 = new Naloga1();
		t2 = new Naloga1();
		t1.tocka[0] = 7;
		t1.tocka[1] = 2;
		t1.izpisiTocko();                   // 1. izpis
		t2.tocka[0] = -3;
		t2.tocka[1] = -5;
		t2.izpisiTocko();                   // 2. izpis

		t1.izpisiTocko();                 // 3. izpis
		t2.izpisiTocko();                 // 4. izpis
	}
}

/*
	bi si upali razložiti pojav?
	tocka property je statičen in je za to last razreda.
	Razredne lastnosti lahko naslavljamo tako prej objektov kot tudi imena razreda.
 */