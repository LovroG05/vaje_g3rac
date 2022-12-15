import java.util.Arrays;

public class Naloga4 {
	public static void main(String[] args) {
		// 5, 10, 25, 60, 145, 350, ...
		int[] zaporedje = new int[10];

		int a = 0;
		int b = 5;

		for(int i = 0; i < 10; i++) {
			zaporedje[i] = b;

			int c = (b * 2) + a;
			a = b;
			b = c;
		}

		// mehurčkasto sortiranje
		for(int i = 0; i < zaporedje.length; i++) {
			for(int j = 0; j < zaporedje.length; j++) {
				if(zaporedje[i] > zaporedje[j]) {
					int d = zaporedje[i];
					zaporedje[i] = zaporedje[j];
					zaporedje[j] = d;
				}
			}
		}

		System.out.println(Arrays.toString(zaporedje));
	}
}
