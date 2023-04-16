public class Naloga4 {
	public static void main(String[] args) {
		not();
		and();
		or();
		xor();
		nand();
		nor();
	}

	public static void not() {
		System.out.printf("%-5s | NOT X\n", "X");
		System.out.println("-------------");
		boolean x = true;
		System.out.printf("%-5b | %b\n", x, !x);
		x = false;
		System.out.printf("%-5b | %b\n", x, !x);
		System.out.println();
	}

	public static void and() {
		System.out.printf("%-5s %-5s | X AND Y\n", "X", "Y");
		System.out.println("---------------------");
		boolean x = true;
		boolean y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x && y);
		x = false;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x && y);
		x = false;
		y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x && y);
		x = true;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x && y);
		System.out.println();
	}

	public static void or() {
		System.out.printf("%-5s %-5s | X OR Y\n", "X", "Y");
		System.out.println("--------------------");
		boolean x = true;
		boolean y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x || y);
		x = false;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x || y);
		x = false;
		y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x || y);
		x = true;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x || y);
		System.out.println();
	}

	public static void xor() {
		System.out.printf("%-5s %-5s | X XOR Y\n", "X", "Y");
		System.out.println("---------------------");
		boolean x = true;
		boolean y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x ^ y);
		x = false;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x ^ y);
		x = false;
		y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x ^ y);
		x = true;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, x ^ y);
		System.out.println();
	}

	public static void nand() {
		System.out.printf("%-5s %-5s | X NAND Y\n", "X", "Y");
		System.out.println("----------------------");
		boolean x = true;
		boolean y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x && y));
		x = false;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x && y));
		x = false;
		y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x && y));
		x = true;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x && y));
		System.out.println();
	}

	public static void nor() {
		System.out.printf("%-5s %-5s | X NOR Y\n", "X", "Y");
		System.out.println("---------------------");
		boolean x = true;
		boolean y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x || y));
		x = false;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x || y));
		x = false;
		y = true;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x || y));
		x = true;
		y = false;
		System.out.printf("%-5b %-5b | %-5b\n", x, y, !(x || y));
		System.out.println();
	}
}
