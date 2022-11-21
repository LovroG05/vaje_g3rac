public class Naloga3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		naloga3(num);
		System.out.println();
		naloga5_3(num);
		System.out.println();
		naloga6_3(num);
	}

	public static void naloga3(int num) {
		int i = 0;
		int j = 0;

		while(j < num - 1) {
			int temp = num - j;
			while(i < num - j) {
				System.out.print(temp);
				temp--;
				i++;
			}
			System.out.println();
			j++;
			i = 0;
			int k = 0;
			while(k != j) {
				System.out.print(" ");
				k++;
			}
		}
	}

	public static void naloga5_3(int num) {
		int i = 0;
		int j = 0;

		do {
			int temp = num - j;
			do {
				System.out.print(temp);
				temp--;
				i++;
			} while(i < num - j);
			System.out.println();
			j++;
			i = 0;
			int k = 0;
			do {
				System.out.print(" ");
				k++;
			} while(k != j);
		} while(j < num - 1);
	}

	public static void naloga6_3(int num) {
		for(int j = 0; j < num - 1; ) {
			int temp = num - j;
			for(int i = 0; i < num - j; i++) {
				System.out.print(temp);
				temp--;
			}
			System.out.println();
			j++;
			for(int k = 0; k != j; k++) {
				System.out.print(" ");
			}
		}
	}
}