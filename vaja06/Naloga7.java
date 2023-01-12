public class Naloga7 {
	public static void main(String[] args) {
		checkKvadrat(new Tocka(
				Integer.parseInt(args[0]),
				Integer.parseInt(args[1])
		));

		checkKvadrat(new Tocka(
				(int) (Math.random() * 9),
				(int) (Math.random() * 9)
		));
	}

	private static void checkKvadrat(Tocka t) {
		Tocka a = new Tocka(1, 0);
		Tocka b = new Tocka(7, 6);

		if(((t.y == a.y || t.y == b.y) && (a.x <= t.x && t.x <= b.x)) ||
				((t.x == a.x || t.x == b.x) && (a.y <= t.y && t.y <= b.y))) {
			System.out.println("Točka je na kvadratu");
		} else if((a.x < t.x && t.x < b.x) ||
				(a.y < t.y && t.y < b.y)) {
			System.out.println("Točka je v kvadratu");

		} else {
			System.out.println("Točke ni v kvadratu");
		}
	}

	private record Tocka(int x, int y) {
	}
}
