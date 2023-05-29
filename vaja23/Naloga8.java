import java.util.Arrays;

public class Naloga8 {
	public static void main(String[] args) {
		Zbirka zbirka = new Zbirka();

		System.out.println(zbirka.getNakljucnoImeIzZbirke());
		System.out.println();

		zbirka.pokaziVsaImena();
		System.out.println();

		zbirka.pokaziVsePriimke();
		System.out.println();

		zbirka.pokazi20Oseb();
		System.out.println();

		System.out.println(Arrays.toString(zbirka.getOseba()));
	}
}
