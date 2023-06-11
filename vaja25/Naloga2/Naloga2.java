package Naloga2;

public class Naloga2 {
	public static void main(String[] args) {
		// a)
		Kvadrat kvadrat = new Kvadrat(0, 0, 5);
		Pravokotnik pravokotnik = new Pravokotnik(6, 0, 4, 6);
		Kroznica kroznica = new Kroznica(13, 0, 3);

		System.out.println("Kvadrat: " + kvadrat);
		System.out.println("Obseg: " + kvadrat.getObseg());
		System.out.println("Ploščina: " + kvadrat.getPloscina());

		System.out.println("Pravokotnik: " + pravokotnik);
		System.out.println("Obseg: " + pravokotnik.getObseg());
		System.out.println("Ploščina: " + pravokotnik.getPloscina());

		System.out.println("Kroznica: " + kroznica);
		System.out.println("Obseg: " + kroznica.getObseg());
		System.out.println("Ploščina: " + kroznica.getPloscina());

		// b)
		EnakostranicniTrikotnik enakostranicniTrikotnik = new EnakostranicniTrikotnik(0, 0, 5);
		EnakokrakiTrikotnik enakokrakiTrikotnik = new EnakokrakiTrikotnik(1, 1, 4);
		Trikotnik trikotnik = new Trikotnik(2, 2, 3, 4);

		System.out.println("Enakostranicni trikotnik: " + enakostranicniTrikotnik);
		System.out.println("Obseg: " + enakostranicniTrikotnik.getObseg());
		System.out.println("Ploscina: " + enakostranicniTrikotnik.getPloscina());

		System.out.println("Enakokraki trikotnik: " + enakokrakiTrikotnik);
		System.out.println("Obseg: " + enakokrakiTrikotnik.getObseg());
		System.out.println("Ploscina: " + enakokrakiTrikotnik.getPloscina());

		System.out.println("Trikotnik: " + trikotnik);
		System.out.println("Obseg: " + trikotnik.getObseg());
		System.out.println("Ploscina: " + trikotnik.getPloscina());

		// c)
		PravokotniTrikotnik pravokotniTrikotnik = new PravokotniTrikotnik(0, 0, 3, 4);

		System.out.println("Pravokotni trikotnik: " + pravokotniTrikotnik.toString());
		System.out.println("Obseg: " + pravokotniTrikotnik.getObseg());
		System.out.println("Ploscina: " + pravokotniTrikotnik.getPloscina());
	}
}
