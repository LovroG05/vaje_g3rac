package com.example.vaja19;

import javafx.scene.paint.Color;

public class Krog {
	private int x;
	private int y;
	private int visina;
	private Color color;

	public Krog(int x, int y, int visina, Color color) {
		this.x = x;
		this.y = y;
		this.visina = visina;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
