import java.util.Scanner;

public class Naloga8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));

		int rez = ~a ^ b;

		int b0 = rez & 0b1;
		int b1 = (rez & 0b10) >> 1;
		int b2 = (rez & 0b100) >> 2;
		int b3 = (rez & 0b1000) >> 3;

		System.out.println(b0 + b1 + b2 + b3);
	}
}
