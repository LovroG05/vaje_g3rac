public class Naloga1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		int i = 0;
		while(i < a) {
			System.out.print(a);
			i++;
		}

		System.out.println();
		i = 0;
		do {
			System.out.print(a);
			i++;
		} while(i < a);

		System.out.println();
		for(int j = 0; j < a; j++) {
			System.out.print(a);
		}
	}
}
