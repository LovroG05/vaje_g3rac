import java.util.Scanner;

public class Naloga5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int b0 = a & 0b1;
		int b1 = (a & 0b10) >> 1;
		int b2 = (a & 0b100) >> 2;
		int b3 = (a & 0b1000) >> 3;

		System.out.println(b0 + b1 + b2 + b3);
	}
}
