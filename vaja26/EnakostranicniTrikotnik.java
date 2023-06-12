public class EnakostranicniTrikotnik implements Lik {
	private double a;

	public EnakostranicniTrikotnik(double a) {
		this.a = a;
	}

	@Override
	public double getDiagonala() {
		return a;
	}

	public double getVisina() {
		return Math.sqrt(a * a - (a / 2) * (a / 2));
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "EnakostranicniTrikotnik(" + a + ") visina: " + getVisina();
	}
}
