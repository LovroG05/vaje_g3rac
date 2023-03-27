package com.example.vaja19;

import javafx.scene.paint.Color;

public class Trikotnik {
	private int x;
	private int y;
	private int visina;
	private Color color;

	public Trikotnik(int x, int y, int visina, Color color) {
		this.x = x;
		this.y = y;
		this.visina = visina;
		this.color = color;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVisina() {
		return this.visina;
	}

	public void setVisina(int visina) {
		if(visina > 5 && visina < 40) {
			this.visina = visina;
		}
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}