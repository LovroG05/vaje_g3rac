class Naloga2 {
	public static void main(String[] argumenti) {
		System.out.println(argumenti[1]);
		int a = Integer.valueOf(argumenti[1]);
		System.out.println(a);
	}
}

/**
 * kaj program izpiše pri klicu z dano sintakso;
 * 2 \n 2
 *
 * kateri od argumentov podanih programov se dejansko izpiše;
 * 2.
 *
 * kako bi izpisali še preostala dva argumenta;
 * for(String arg : argumenti) { System.out.println(arg); }
 *
 * kaj se zgodi, če program kličete z : java Naloga2 1 2 3 4 5 ;
 * izpiše 2
 *
 * kaj se zgodi, če program kličete z : java Naloga2 ;
 * Nstane izjema java.lang.ArrayIndexOutOfBoundsException
 *
 * kaj se zgodi, če program kličete z : java Naloga2 ena dva tri .
 * izpiše dva
 */