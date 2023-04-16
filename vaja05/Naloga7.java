import java.util.Scanner;

public class Naloga7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = Integer.toBinaryString(sc.nextInt());
		int kolikoEna = 0;

		for(int i = a.length() - 1; i > a.length() - 5; i--) {
			if(a.charAt(i) == '1') {
				kolikoEna++;
			}
		}

		System.out.println("Na 1 jih je: " + kolikoEna);
	}
}
