public class Naloga2 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		int i = 0;
		while(i < a) {
			int j = 0;
			while(j < a) {
				System.out.print(a);
				j++;
			}
			i++;
			System.out.println();
		}

		System.out.println();
		i = 0;
		do {
			int j = 0;

			do {
				System.out.print(a);
				j++;
			} while(j < a);
			i++;
			System.out.println();
		} while(i < a);

		System.out.println();
		for(int j = 0; j < a; j++) {
			for(int k = 0; k < a; k++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
