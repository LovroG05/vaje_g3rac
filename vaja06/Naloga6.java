public class Naloga6 {
	public static void main(String[] arg) {
		int a = (int) (Math.random() * 6 + 1);
		int b = (int) (Math.random() * 6 + 1);

		System.out.println(" -----    -----");
		System.out.printf("| %s %s |  | %s %s |\n", a > 3 ? "*" : " ", a > 1 ? "*" : " ", b > 3 ? "*" : " ", b > 1 ? "*" : " ");
		System.out.printf("| %s%s%s |  | %s%s%s |\n", a == 6 ? "*" : " ", a % 2 > 0 ? "*" : " ", a == 6 ? "*" : " ", b == 6 ? "*" : " ", b % 2 > 0 ? "*" : " ", b == 6 ? "*" : " ");
		System.out.printf("| %s %s |  | %s %s |\n", a > 1 ? "*" : " ", a > 3 ? "*" : " ", b > 1 ? "*" : " ", b > 3 ? "*" : " ");
		System.out.println(" -----    ----- ");
	}
}
