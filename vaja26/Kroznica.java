public class Kroznica implements Lik {
	private double r;

	public Kroznica(double r) {
		this.r = r;
	}

	@Override
	public double getDiagonala() {
		return 2 * r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Kroznica (" + r + ")";
	}
}
