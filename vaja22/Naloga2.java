public class Naloga2 {
	private record Point(int x, int y) {
	}

	private static final int[][] SUDOKU = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2},
			{6, 7, 2, 1, 9, 5, 3, 4, 8},
			{1, 9, 8, 3, 4, 2, 5, 6, 7},
			{8, 5, 9, 7, 6, 1, 4, 2, 3},
			{4, 2, 6, 8, 5, 3, 7, 9, 1},
			{7, 1, 3, 9, 2, 4, 8, 5, 6},
			{9, 6, 1, 5, 3, 7, 2, 8, 4},
			{2, 8, 7, 4, 1, 9, 6, 3, 5},
			{3, 4, 5, 2, 8, 6, 1, 7, 9}
	};

	public static void main(String[] args) {
		// preverimo kradvate
		for(int i = 0; i < SUDOKU.length; i += 3) {
			for(int j = 0; j < SUDOKU[i].length; j += 3) {
				if(!checkRange(new Point(i, j), new Point(i + 2, j + 2))) {
					System.out.println("Ni rešitve (kvadrati)");
					return;
				}
			}
		}

		// preverimo vrstice
		for(int i = 0; i < 9; i++) {
			if(!checkRange(new Point(0, i), new Point(8, i))) {
				System.out.println("Ni rešitve (vrstice)");
				return;
			}
		}

		// preverimo stolpce
		for(int i = 0; i < 9; i++) {
			if(!checkRange(new Point(i, 0), new Point(8, i))) {
				System.out.println("Ni rešitve (stolpci)");
				return;
			}
		}

		System.out.printf("Pravilno rešen, %s X sudoku in %s hyper sudoku.\n", isX() ? "je" : "ni", isHyper() ? "je" : "ni");
	}

	private static boolean isHyper() {
		for(int i = 1; i < SUDOKU.length; i += 4) {
			for(int j = 1; i < SUDOKU.length; i += 4) {
				if(!checkRange(new Point(i, j), new Point(i + 2, j + 2))) {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean isX() {
		boolean[] tabela1 = new boolean[9];
		boolean[] tabela2 = new boolean[9];

		for(int i = 0; i < SUDOKU.length; i++) {
			tabela1[SUDOKU[i][i] - 1] = true;
		}

		for(int i = 0; i < SUDOKU.length; i++) {
			tabela2[SUDOKU[SUDOKU.length - i - 1][i] - 1] = true;
		}

		return vseStevke(tabela1) && vseStevke(tabela2);
	}

	private static boolean checkRange(Point a, Point b) {
		boolean[] tabela = new boolean[9];

		for(int x = a.x; x <= b.x; x++) {
			for(int y = a.y; y <= b.y; y++) {
				tabela[SUDOKU[x][y] - 1] = true;
			}
		}

		return vseStevke(tabela);
	}

	private static boolean vseStevke(boolean[] tab) {
		for(boolean value : tab) {
			if(!value) {
				return false;
			}
		}

		return true;
	}
}
