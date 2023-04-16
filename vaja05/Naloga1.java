public class Naloga1 {
	public static void main(String[] args) {
		String[] ime = "Nanes Jovak".split(" ");

		for(int i = 0; i < 11; i++) {
			System.out.print(ime[0].charAt(0));
			System.out.print(" ");
			System.out.println(ime[1].charAt(0));
		}
	}
}
