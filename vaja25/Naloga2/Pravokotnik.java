package Naloga2;

public class Pravokotnik extends Kvadrat {
	double stranicaB;

	public Pravokotnik(int x, int y, double stranicaA, double stranicaB) {
		super(x, y, stranicaA);
		this.stranicaB = stranicaB;
	}

	@Override
	public double getObseg() {
		return 2 * stranicaA + 2 * stranicaB;
	}

	@Override
	public double getPloscina() {
		return stranicaA * stranicaB;
	}

	public String toString() {
		return super.toString().substring(0, super.toString().length() - 1) + "," + stranicaB + ")";
	}
}