import java.util.Random;

public class Naloga5 {
	static final char[] samoglasniki = {'A', 'E', 'I', 'O', 'U'};

	public static void main(String[] args) {
		a();
		b();
	}

	private static void a() {
		Random random = new Random();
		char[] nakljucno = new char[20];

		for(int i = 0; i < nakljucno.length; i++) {
			nakljucno[i] = samoglasniki[random.nextInt(samoglasniki.length)];
		}

		izpisiTabelo(nakljucno);
		System.out.println("Prva: " + nakljucno[0]);
		System.out.println("Zadnja: " + nakljucno[nakljucno.length - 1]);

		System.out.println();
	}

	private static void b() {
		Random random = new Random();
		char[] nakljucno = new char[random.nextInt((20 - 10) + 1) + 10];

		for(int i = 0; i < nakljucno.length; i++) {
			nakljucno[i] = samoglasniki[random.nextInt(samoglasniki.length)];
		}

		izpisiTabelo(nakljucno);
		System.out.println("Prvi dve crki: " + nakljucno[0] + " " + nakljucno[1]);
		System.out.println("Zadnji dve crki: " + nakljucno[nakljucno.length - 2] + " " + nakljucno[nakljucno.length - 1]);
	}

	private static void izpisiTabelo(char[] chars) {
		System.out.print("Vsebina tabele: ");
		for(char c : chars) {
			System.out.print(c + " ");
		}

		System.out.println();
	}
}
