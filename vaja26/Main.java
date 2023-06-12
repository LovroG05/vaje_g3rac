import java.util.Arrays;

public class Main {
	private static final Lik[] liks = new Lik[200];

	public static void main(String[] args) {
		zacetnoPolnjenje();
		System.out.println(prestej(Kvadrat.class));
		diagonale();
		sysout();
	}

	private static void zacetnoPolnjenje() {
		for(int i = 0; i < liks.length; i++) {
			int a = (int) (Math.random() * 4);

			liks[i] = switch(a) {
				case 1 -> new Kvadrat(4);
				case 2 -> new Kroznica(5);
				case 3 -> new EnakostranicniTrikotnik(5);
				default -> new Pravokotnik(4, 5);
			};
		}
	}

	private static long prestej(Class clazz) {
		// praviloma se reš s for loopom in typeof (ali getClass), ampak tole je bl bolš
		// also also, za tole more bit mal novejša java
		return Arrays.stream(liks)
				.filter(lik -> lik.getClass().equals(clazz))
				.count();
	}

	private static void diagonale() {
		Arrays.stream(liks)
				.forEach(lik -> System.out.println(lik.getDiagonala()));
	}

	private static void sysout() {
		Arrays.stream(liks)
				.forEach(System.out::println);
	}
}