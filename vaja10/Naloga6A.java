public class Naloga6A {
	public static void main(String[] args) {
		String x = "2005";
		int[] stevke = new int[4];

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
