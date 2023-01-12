public class Naloga3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if(a > b && a > c) {
			System.out.println(a);
		} else if(b > a && b > c) {
			System.out.println(b);
		} else if(c > a && c > b) {
			System.out.println(c);
		}

		if((a > c && a < b) || (a > b && a < c)) {
			System.out.println(a);
		} else if((b > c && b < a) || (b > a && b < c)) {
			System.out.println(b);
		} else if((c > a && c < b) || (c > b && c < a)) {
			System.out.println(c);
		}

		if(a < b && a < c) {
			System.out.println(a);
		} else if(b < a && b < c) {
			System.out.println(b);
		} else if(c < a && c < b) {
			System.out.println(c);
		}
	}
}
