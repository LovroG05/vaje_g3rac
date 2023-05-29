public class Niz {
	private final String niz1;

	public Niz(String niz1) {
		this.niz1 = niz1;
	}

	public int primerjaj(String niz2) {
		if(niz1.length() != niz2.length()) {
			if(niz1.length() > niz2.length()) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}
}
