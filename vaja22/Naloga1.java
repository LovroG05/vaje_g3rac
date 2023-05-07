import java.util.Arrays;

public class Naloga1 {
	public static void main(String[] args) {
		// tabela z naključno vsebino (ha,ha,ha), dolžine 12
		// zanima nas, ali so v njej vsebovane VSE števke
		int[] tn = {1, 2, 3, 7, 9, 2, 3, 4, 5, 6, 7, 8, 8, 8, 1, 1, 2, 4};

		// tabela, v katero si zapisjemo obstoj posamezne števke
		int[] stevke = new int[10];

		// vizualizirajmo tabeli:
		System.out.println("stevke: " + Arrays.toString(stevke));
		System.out.println("vredno: " + Arrays.toString(tn));

		// preletimo tabelo tn in označimo prisotnost v tabeli stevke
		// če je stevka 3, potem v tabelo stevke na mesto 3 vpisemo enico
		// torej je razprsilna funkcija h(i) = i ... vrednost elementa iz tabele tn
		// daje mesto v tabeli stevke, kjer je zapisano, ali je element prisoten ali ne
		for(int i = 0; i < tn.length; i++) {
			stevke[tn[i]] = 1;     // napisemo notri enico
		}

		//poglejmo se enkrat tabelo stevk:
		// ce so notri same enice
		System.out.println("stevke: " + Arrays.toString(stevke));
		System.out.println("Iz zadnje tabele ugotovite, katera vrednost manjka ....");

		// ne manjka nobena
	}
}