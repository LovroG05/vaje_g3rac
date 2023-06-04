public class Naloga1 {
	static final String a = "abcd";

	public static void main(String[] args) {
		String prva = new String(a);
		System.out.println(prva);

		String druga = new String(prva);
		System.out.println(druga);

		char[] c = {'a', 'b', 'c', 'd'};
		String tretja = new String(c);
		System.out.println(tretja);

		char[] d = {};
		String cetrta = new String(d);
		System.out.println(cetrta);
	}
}