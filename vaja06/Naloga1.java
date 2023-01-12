public class Naloga1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if(a < b) {
			System.out.println("prvo število je manjše");
		} else {
			System.out.println("drugo število je manjše");
		}
	}
}