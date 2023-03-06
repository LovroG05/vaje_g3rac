/**
 * @author Jurij Fortuna
 * vir: https://github.com/LovroG05/vaje_g3rac/tree/master/vaja16
 */
public class Naloga2 {
	private static int rep;
	private static Element[] vrsta = new Element[10];

	private record Element(int num, int priority) {
		@Override
		public String toString() {
			return "Element{" +
					"num=" + num +
					", priority=" + priority +
					'}';
		}
	}

	public static void main(String[] args) {
		push(new Element(1234, 4));
		push(new Element(5543, 5));
		push(new Element(685, 0));

		System.out.println(pop());
	}

	private static void push(Element element) {
		if(rep < vrsta.length - 1) {
			vrsta[rep++] = element;
		}
	}

	private static Element pop() {
		Element toReturn = new Element(0, 0);
		int a = 0;

		for(int i = 0; i < vrsta.length; i++) {
			Element el = vrsta[i];

			if(el == null) {
				continue;
			}

			if(el.priority >= toReturn.priority) {
				toReturn = el;
				a = i;
			}
		}

		// Shiftnemo array
		for(int i = a; i < vrsta.length - 1; i++) {
			Element c = vrsta[i];
			vrsta[i] = vrsta[i + 1];
			vrsta[i - 1] = c;
		}

		return toReturn;
	}
}