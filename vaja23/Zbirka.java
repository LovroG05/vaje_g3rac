public class Zbirka {
	String[] imena = {"Franc", "Marija", "Janez", "Ana", "Marko", "Maja", "Andrej", "Irena", "Ivan", "Mojca", "Anton", "Nina", "Luka", "Mateja", "Jože", "Nataša", "Jožef", "Eva", "Matej", "Andrej"};
	String[] priimki = {"Novak", "Horvat", "Kovačič", "Krajnc", "Zupančič", "Kovač", "Potočnik", "Mlakar", "Vidmar", "Kos", "Golob", "Kralj", "Turk", "Božič", "Korošec", "Bizjak", "Zupan", "Kotnik", "Hribar", "Kavčič"};

	public String getNakljucnoImeIzZbirke() {
		return imena[(int) (Math.random() * 20)];
	}

	public void pokaziVsaImena() {
		for(int i = 0; i < imena.length - 1; i++) {
			for(int j = 0; j < imena.length - 1 - i; j++) {
				if(imena[j].length() > imena[j + 1].length()) {
					String temp = imena[j];
					imena[j] = imena[j + 1];
					imena[j + 1] = temp;
				}
			}
		}

		for(String s : imena) {
			System.out.println(s);
		}
	}

	public void pokaziVsePriimke() {
		for(int i = 0; i < priimki.length - 1; i++) {
			for(int j = 0; j < priimki.length - 1 - i; j++) {
				if(priimki[j].length() > priimki[j + 1].length()) {
					String temp = priimki[j];
					priimki[j] = priimki[j + 1];
					priimki[j + 1] = temp;
				}
			}
		}

		for(String s : priimki) {
			System.out.println(s);
		}
	}

	public void pokazi20Oseb() {
		for(int i = 0; i < imena.length; i++) {
			System.out.println(priimki[(int) (Math.random() * 20)] + " " + imena[(int) (Math.random() * 20)]);
		}
	}

	public String[] getOseba() {
		return new String[]{imena[(int) (Math.random() * 20)], priimki[(int) (Math.random() * 20)]};
	}
}
