public class Naloga3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int vsota = a + b;
		int produkt = a * b;
		int razlika = a - b;
		int kolicnik = a / b;

		System.out.println("vsota števil " + vsota);
		System.out.println("produkt števil " + produkt);
		System.out.println("razlika števil " + razlika);
		System.out.println("količnik števil " + kolicnik);
	}
}
