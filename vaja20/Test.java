import java.awt.*;

/**
 * aplikacija namenjena izvanju testov sestavljanja trikotnikov iz množice
 * naključno generiranih daljic
 * v osnovi lahko naredi več (zaporednih) testov
 * <p>
 * pri tem sam razred/aplikacija služi le kot ovojnica za kreiranje testa
 * <p>
 * vsak test zgenerira 200 daljic in si jih zapomni,nato skuša iz treh
 * sestaviti trikotnik (trikotnik se sestavi glede na dolžino daljice, ne
 * na njeno pozicijo v ravnini oz. orientacijo). Če sestava uspe, trikotnik
 * zapišemo v tabelo trikotnikov, uporabljene daljice pa umaknemo iz tabele daljic
 */
public class Test {
	private final int zaporednoStevilo;

	private final Daljica[] daljice = new Daljica[200];
	private final Trikotnik[] tabTrik = new Trikotnik[100];
	private int trikPointer = 0;

	public Test(int zaporednoStevilo) {
		this.zaporednoStevilo = zaporednoStevilo;

		for(int i = 0; i < daljice.length; i++) {
			daljice[i] = new Daljica(
					new Tocka(RacLib.randomBetween(-99, 99), RacLib.randomBetween(-99, 99)),
					new Tocka(RacLib.randomBetween(-99, 99), RacLib.randomBetween(-99, 99)),
					Color.BLACK
			);
		}

		for(int i = 0; i < daljice.length - daljice.length % 3; i += 3) {
			tabTrik[trikPointer++] = new Trikotnik(daljice[i], daljice[i + 1], daljice[i + 2], Color.BLACK);
			daljice[i] = null;
			daljice[i + 1] = null;
			daljice[i + 2] = null;
		}
	}

	public int getSteviloTrikotnikov() {
		int toReturn = 0;

		for(int i = 0; i < tabTrik.length; i++) {
			if(tabTrik[i] != null) {
				toReturn++;
			}
		}

		return toReturn;
	}

	public int getSteviloNerazporejenihDaljic() {
		int toReturn = 0;

		for(int i = 0; i < daljice.length; i++) {
			if(daljice[i] != null) {
				toReturn++;
			}
		}

		return toReturn;
	}

	public int getZaporednoStevilo() {
		return zaporednoStevilo;
	}

	public static void main(String[] args) {
		int stTestov = 2;  // privzeto število testov je ...

		if(args.length > 0) { // ča pa z argumentom podamo drugače
			try {
				stTestov = Integer.parseInt(args[0]);
				if(stTestov <= 0) stTestov = 1;
			} catch(NumberFormatException e) {
				stTestov = 2;
			}
		}

        /*
        kreiramo test z enolično zaporedno št. testa
        kreiramo trikotnike
        izvedemo izpis rezultatov
        */
		for(int i = 0; i < stTestov; i++) {
			Test test = new Test(i + 1);

			/*
			 *   operacije za dosego cilja
			 */
			System.out.println("V testu " + test.getZaporednoStevilo() + " smo sestavili " + test.getSteviloTrikotnikov() + " trikotnikov");
			System.out.println(" Ostalo je " + test.getSteviloNerazporejenihDaljic() + " nerazporejenih daljic");
		}
	}
}