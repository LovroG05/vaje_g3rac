import java.awt.*;

/**
 * vsebuje 3 daljice, ki ga lahko sestavijo ali pa tri daljice, dolžinsko enake 0
 * : se zna vizualizirati z izpisom daljic
 * : zna selektivno/posamezno vrniti dolžino izbrane stranice
 */
public class Trikotnik {
	private Daljica a;
	private Daljica b;
	private Daljica c;
	private Color barva;

	public Trikotnik(Daljica a, Daljica b, Daljica c, Color barva) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.barva = barva;
	}

	public Daljica getA() {
		return a;
	}

	public void setA(Daljica a) {
		this.a = a;
	}

	public Daljica getB() {
		return b;
	}

	public void setB(Daljica b) {
		this.b = b;
	}

	public Daljica getC() {
		return c;
	}

	public void setC(Daljica c) {
		this.c = c;
	}

	public Color getBarva() {
		return barva;
	}

	public void setBarva(Color barva) {
		this.barva = barva;
	}

	@Override
	public String toString() {
		return "(" + "a=" + a + ", b=" + b + ", c=" + c + ")";
	}
}
