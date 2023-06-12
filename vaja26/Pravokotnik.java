public class Pravokotnik extends Kvadrat {
	private double b;

	public Pravokotnik(double a, double b) {
		super(a);
		this.b = b;
	}

	@Override
	public double getDiagonala() {
		return getDolzinaDiagonale();
	}

	public double getDolzinaDiagonale() {
		double a = super.getA();
		return Math.sqrt(a * a + b * b);
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Pravokotnik(" + super.getA() + ", " + b + ") diagonala: " + getDiagonala();
	}
}
