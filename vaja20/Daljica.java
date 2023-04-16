import java.awt.*;

/**
 * jo sestavljata 2 točki Točka
 * daljica je lahko kjerkoli v prostoru, kakorkoli orientirana,
 * vizualizira se kot d(t1(x,y),t2(x,y)) ali ((x,y),(x,y)) - izberite!
 * : zna povedati svojo dolžino
 * : zna se premakniti v prostoru za izbrani vektor (dx,dy)
 */
public class Daljica {
	private Tocka tocka1;
	private Tocka tocka2;
	private Color barva;

	public Daljica(Tocka tocka1, Tocka tocka2, Color barva) {
		this.tocka1 = tocka1;
		this.tocka2 = tocka2;
		this.barva = barva;
	}

	public double getDolzina() {
		double dx = tocka2.getX() - tocka1.getX();
		double dy = tocka2.getY() - tocka1.getY();

		return Math.sqrt(dx * dx + dy * dy);
	}

	public void premik(int dx, int dy) {
		tocka1.setX(tocka1.getX() + dx);
		tocka1.setY(tocka1.getY() + dy);
		tocka2.setX(tocka2.getX() + dx);
		tocka2.setY(tocka2.getY() + dy);
	}

	public Tocka getTocka1() {
		return tocka1;
	}

	public void setTocka1(Tocka tocka1) {
		this.tocka1 = tocka1;
	}

	public Tocka getTocka2() {
		return tocka2;
	}

	public void setTocka2(Tocka tocka2) {
		this.tocka2 = tocka2;
	}

	public Color getBarva() {
		return barva;
	}

	public void setBarva(Color barva) {
		this.barva = barva;
	}

	@Override
	public String toString() {
		return "(" + tocka1 + "," + tocka2 + ")";
	}
}
