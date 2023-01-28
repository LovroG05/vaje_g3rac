import java.util.Arrays;

public class Naloga3 {
	public static void main(String[] args) {
		int[] tab = RacLib.FOO;

		System.out.println(Arrays.toString(tab));
		System.out.println(Arrays.toString(obrniZaporedjeVDaniTabeli(tab)));
	}

	private static int[] obrniZaporedjeVDaniTabeli(int[] tab) {
		for(int i = 0; i < tab.length / 2; i++) {
			int c = tab[i];
			tab[i] = tab[tab.length - 1 - i];
			tab[tab.length - 1 - i] = c;
		}

		return tab;
	}
}

/*
	Ideja je, da gremo čez polovico tabele in vsak element zamenjamo z njegovim nasprotnim elementom.
 */