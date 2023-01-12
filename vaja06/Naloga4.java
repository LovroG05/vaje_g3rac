public class Naloga4 {
	public static void main(String[] args) {
		ifStavek(Integer.parseInt(args[0]));
		switchStavek(Integer.parseInt(args[0]));
	}

	public static void ifStavek(int a) {
		if(a == 1 || a == 8 || a == 15 || a == 22 || a == 29) {
			System.out.println("Ponedeljek");
		} else if(a == 2 || a == 9 || a == 16 || a == 23 || a == 30) {
			System.out.println("Torek");
		} else if(a == 3 || a == 10 || a == 17 || a == 24 || a == 31) {
			System.out.println("Sreda");
		} else if(a == 4 || a == 11 || a == 18 || a == 25 || a == 32) {
			System.out.println("Četrtek");
		} else if(a == 5 || a == 12 || a == 19 || a == 26) {
			System.out.println("Petek");
		} else if(a == 6 || a == 13 || a == 20 || a == 27) {
			System.out.println("Sobota");
		} else if(a == 7 || a == 14 || a == 21 || a == 28) {
			System.out.println("Nedelja");
		}
	}

	public static void switchStavek(int a) {
		switch(a) {
			case 1, 8, 15, 22, 29:
				System.out.println("Ponedeljek");
				break;
			case 2, 9, 16, 23, 30:
				System.out.println("Torek");
				break;
			case 3, 10, 17, 24, 31:
				System.out.println("Sreda");
				break;
			case 4, 11, 18, 25, 32:
				System.out.println("Četrtek");
				break;
			case 5, 12, 19, 26:
				System.out.println("Petek");
				break;
			case 6, 13, 20, 27:
				System.out.println("Sobota");
				break;
			case 7, 14, 21, 28:
				System.out.println("Nedelja");
				break;
		}
	}
}
