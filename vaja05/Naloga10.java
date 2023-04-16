import java.util.Scanner;

public class Naloga10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println(a * 9);

		int b = a;

		for(int i = 1; i < 9; i++) {
			b = b + a;
		}

		System.out.println(b);

		System.out.println(a / Math.pow(9, -1));
	}
}
