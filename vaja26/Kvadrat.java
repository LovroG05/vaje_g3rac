public class Kvadrat implements Lik {
	private double a;

	public Kvadrat(double a) {
		this.a = a;
	}

	@Override
	public double getDiagonala() {
		return getDolzinaDiagonale();
	}

	public double getDolzinaDiagonale() {
		return a * Math.sqrt(2);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Kvadrat(" + a + ") diagonala: " + getDiagonala();
	}
}
