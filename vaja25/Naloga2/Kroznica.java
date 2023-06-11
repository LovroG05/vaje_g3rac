package Naloga2;

class Kroznica extends Lik {
	double radij;

	public Kroznica(int x, int y, double radij) {
		super(x, y);
		this.radij = radij;
	}

	@Override
	public double getObseg() {
		return 2 * Math.PI * radij;
	}

	@Override
	public double getPloscina() {
		return Math.PI * radij * radij;
	}

	public String toString() {
		return super.toString().substring(0, super.toString().length() - 1) + ",r:" + radij + ")";
	}
}

