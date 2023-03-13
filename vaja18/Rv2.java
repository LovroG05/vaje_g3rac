public class Rv2 {
	public static void main(String[] args) {
		Naloga1 t1, t2;
		t1 = new Naloga1();
		t2 = new Naloga1();
		t1.tocka[0] = 7;
		t1.tocka[1] = 2;
		t1.izpisiTocko();
	}
}

/*
	a1) nič ni narobe, vse dela brez kakršnih koli problemov, program izpiše (7,2)
	// komentar: instancirati nalogo 1 je brezvezno, saj je tocka property razreda in ne objekta
 */