public class Rv3a {
	public static void main(String[] args) {
		Naloga1 t1, t2;
		t1 = new Naloga1();
		t2 = new Naloga1();
		t1.tocka[0] = 7;
		t1.tocka[1] = 2;
		t1.izpisiTocko();
		t2.tocka[0] = -3;
		t2.tocka[1] = -5;         // inicializiramo še drugo točko
		t2.izpisiTocko();                       // in jo izpišemo
	}
}