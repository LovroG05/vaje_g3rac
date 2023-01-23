public class Naloga7 {
	private static final int[] foo = {1, 2, 3, 4, 4, 3, 5, 6, 7, 1, 2, 4, 3};

	public static void main(String[] args) {
		System.out.println(isNepadajoce());
		System.out.println(isNenarascujoce());
	}

	private static boolean isNepadajoce() {
		int last = foo[0];

		for(int a : foo) {
			if(!(a >= last)) {
				return false;
			}

			last = a;
		}

		return true;
	}

	private static boolean isNenarascujoce() {
		int last = foo[0];

		for(int a : foo) {
			if(!(a <= last)) {
				return false;
			}

			last = a;
		}

		return true;
	}
}
