package Naloga2;

class Kvadrat extends Lik {
	double stranicaA;

	public Kvadrat(int x, int y, double stranicaA) {
		super(x, y);
		this.stranicaA = stranicaA;
	}

	@Override
	public double getObseg() {
		return 4 * stranicaA;
	}

	@Override
	public double getPloscina() {
		return stranicaA * stranicaA;
	}

	public String toString() {
		return super.toString().substring(0, super.toString().length() - 1) + "," + stranicaA + ")";
	}
}

