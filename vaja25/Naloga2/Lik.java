package Naloga2;

import java.awt.*;

public class Lik {
	public int x, y;
	public Color barva;

	// če damo spodnje, ni več dostopa do default konstruktorja - v izvedenih
	// moraš klicati super ... za ta(spodnji) konstruktor
	public Lik(int x, int y) {
		this.y = x;
		this.y = y;
	}

	public void premakniSeZa(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double getObseg() {
		return 0.0;
	}

	public double getPloscina() {
		return 0.0;
	}
}