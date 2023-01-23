import java.util.ArrayList;

public class Naloga6 {
	private static final int[] foo = {1, 2, 3, 4, 4, 3, 5, 6, 7, 1, 2, 4, 3};

	public static void main(String[] args) {
		System.out.println(prestejZap());
		System.out.println(poisciNajd());
	}

	private static int prestejZap() {
		int toReturn = 0;

		int max = 0;
		for(int i = 0; i < foo.length; i++) {
			int b = Naloga6.foo[i];

			if(b >= max) {
				max = b;
			} else {
				max = 0;
				i--;
				toReturn++;
			}
		}

		return toReturn;
	}

	private static int poisciNajd() {
		ArrayList<Integer> sizes = new ArrayList<Integer>();

		int length = 0;
		int max = 0;
		for(int i = 0; i < foo.length; i++) {
			int b = Naloga6.foo[i];

			if(b >= max) {
				max = b;
				length++;
			} else {
				max = 0;
				i--;
				sizes.add(length);
				length = 0;
			}
		}

		int pos = 0;
		int lmaox = 0;
		for(int i = 0; i < sizes.size(); i++) {
			if(sizes.get(i) >= lmaox) {
				pos = i;
				lmaox = sizes.get(i);
			}
		}

		return pos;
	}

	public static int prestejZap(int[] a) {
		int toReturn = 0;

		int max = 0;
		for(int i = 0; i < a.length; i++) {
			int b = a[i];

			if(b >= max) {
				max = b;
			} else {
				max = 0;
				i--;
				toReturn++;
			}
		}

		return toReturn;
	}

	public static int poisciNajd(int[] a) {
		ArrayList<Integer> sizes = new ArrayList<Integer>();

		int length = 0;
		int max = 0;
		for(int i = 0; i < a.length; i++) {
			int b = a[i];

			if(b >= max) {
				max = b;
				length++;
			} else {
				max = 0;
				i--;
				sizes.add(length);
				length = 0;
			}
		}

		int pos = 0;
		int lmaox = 0;
		for(int i = 0; i < sizes.size(); i++) {
			if(sizes.get(i) >= lmaox) {
				pos = i;
				lmaox = sizes.get(i);
			}
		}

		return pos;
	}
}
