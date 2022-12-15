import java.util.Random;

public class Naloga6B {
	public static void main(String[] args) {
		Random random = new Random();

		String x = String.valueOf(random.nextInt(100000));

		int[] stevke = new int[x.length()];

		for(int i = 0; i < stevke.length; i++) {
			stevke[i] = x.charAt(i) - 48;
		}

		System.out.println("Letnica rojstva: " + x);
		System.out.print("Razčlenjena letnica rojstva: ");

		for(int i = 0; i < stevke.length; i++) {
			System.out.print(stevke[i]);

			if(i != stevke.length - 1) {
				System.out.print(" - ");
			}
		}
	}
}
