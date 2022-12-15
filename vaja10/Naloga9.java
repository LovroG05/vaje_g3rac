import java.util.Arrays;
import java.util.Scanner;

public class Naloga9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vnesi stevilo dijakov: ");
		int stevilo = sc.nextInt();

		int[] uspehi = new int[stevilo];

		System.out.println("Vnesi uspehe:");
		for(int i = 0; i < uspehi.length; i++) {
			String in = sc.next();

			uspehi[i] = switch(in) {
				case "nzd" -> 1;
				case "zd" -> 2;
				case "db" -> 3;
				case "pd" -> 4;
				case "odl" -> 5;
				default -> 0;
			};
		}

		System.out.print("Uspehi: ");
		for(int i = 0; i < uspehi.length; i++) {
			System.out.print(uspehi[i]);

			if(i != uspehi.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();

		int nezadostni = Arrays.stream(uspehi).filter(i -> i == 1).sum();
		int zadostni = Arrays.stream(uspehi).filter(i -> i == 2).sum();
		int dobri = Arrays.stream(uspehi).filter(i -> i == 3).sum();
		int pravDobri = Arrays.stream(uspehi).filter(i -> i == 4).sum();
		int odlicni = Arrays.stream(uspehi).filter(i -> i == 5).sum();
		int neocenjeni = Arrays.stream(uspehi).filter(i -> i == 0).sum();

		System.out.println("Nezadostni: " + nezadostni);
		System.out.println("Zadostni: " + zadostni);
		System.out.println("Dobri: " + dobri);
		System.out.println("Pravdobri: " + pravDobri);
		System.out.println("Odlični: " + odlicni);
		System.out.println("Neocenjeni: " + neocenjeni);
	}
}
