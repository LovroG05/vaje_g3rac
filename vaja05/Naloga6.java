import java.util.Scanner;

public class Naloga6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = (a >> 4) << 4;

		System.out.println(b);
	}
}
