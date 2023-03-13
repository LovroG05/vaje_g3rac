class Naloga1 {
	static int[] tocka = new int[2];

	public static void izpisiTocko() {
		System.out.println("(" + tocka[0] + "," + tocka[1] + ")");
	}

	public static void prestaviTocko(int x, int y) {
		tocka[0] = x;
		tocka[1] = y;
	}
}