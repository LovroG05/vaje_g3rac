public class Naloga2 {
	public static void main(String[] args) {
		String niz = "hm";

		for(int i = 0; i < 1000; i++) {
			niz = new String(niz + i);
			System.out.println(Runtime.getRuntime().freeMemory());
			System.out.println(Runtime.getRuntime().totalMemory());
		}
	}
}