/**
 * @author Žan Piletič, Jurij Fortuna
 * vir: https://github.com/LovroG05/vaje_g3rac/tree/master/vaja16
 */
public class CircularQueue {
	/**
	 * add/remove, offer/poll, dodaj/odvzemi
	 */
	final static private int N = 10;
	static private int[] vrsta = new int[N];

	static private int glava = 0, rep = glava;

	/**
	 * doda element v vrsto
	 */
	public static void dodaj(int element) {
		vrsta[rep] = element;
		System.out.println("Dodajam : " + element);
		rep = (rep + 1) % N;
	}

	/**
	 * vzame element iz vrste in ga vrne klicoči kodi;
	 */
	public static int odvzemi() {
		int el = vrsta[glava];
		vrsta[glava] = 0;
		System.out.println("Jemljem : " + el);

		glava = (glava + 1) % N;

		return el;
	}

	/**
	 * vrne true, če je vrsta prazna
	 */
	public static boolean jePrazna() {
		int pr = 0;
		for(int i = 0; i < N; i++)
			if(vrsta[i] == 0)
				pr++;

		return pr == N;
	}

	/**
	 * vrne true, če je vrsta polna
	 */
	public static boolean jePolna() {
		for(int i = 0; i < N; i++) {
			if(vrsta[i] == 0)
				return false;
		}

		return true;
	}

	/**
	 * pokaže elemente vrste (vrsto razpenjata indeksa glava in rep)
	 */
	public static void pokaziVrsto() {
		int i = glava;
		System.out.print("Kažem vrsto : ");
		System.out.print("[ ");
		while(i % N != rep) {    // začne pri glavi in konča pri repu
			System.out.print(vrsta[i] + " ");
			i = (i + 1) % N;
		}
		System.out.println("]");
	}

	/**
	 * pokaže tabelo vrste
	 * za primer vrste : 7,1,9,3,6
	 * <p>
	 * izvede dvovrstični izris kot
	 * <p>
	 * [ 0 0 0 7 1 9 3 6 0 0 ]
	 * G         R
	 * <p>
	 * ( 0 je na primeru zgolj oznaka za element, ki ni del vrste )
	 */
	public static void pokaziTabeloZVrsto() {
		System.out.print("[");
		for(int i = 0; i < N; i++) {
			System.out.print(vrsta[i] + (i != N - 1 ? "," : ""));
		}
		System.out.println("]");

		System.out.print(" ");
		for(int k = 0; k < N; k++) {
			if(k == rep - 1) {
				System.out.print("R ");
			} else if(k == glava) {
				System.out.print("G ");
			} else {
				System.out.print("  ");
			}

			if(vrsta[k] > 10) {
				System.out.print(" ");
			}
		}
	}
}
