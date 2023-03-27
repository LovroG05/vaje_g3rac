package com.example.vaja19;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Naloga1 extends Application {
	private final Trikotnik[] trikotniki = new Trikotnik[30];
	private final Pravokotnik[] kvadrati = new Pravokotnik[30];
	private final Krog[] krogi = new Krog[40];

	private final Node tNode[] = new Node[100];
	private int tNodePointer = 0;

	private final Group root = new Group();

	@Override
	public void start(Stage stage) {
		// Kroki
		for(int i = 0; i < krogi.length; i++) {
			krogi[i] = new Krog(
					random(0, 900),
					random(0, 900),
					random(5, 40),
					Color.BLUE
			);
		}

		for(int i = 0; i < krogi.length; i++) {
			for(int j = 1; j < krogi.length - i; j++) {
				if(diagonala(krogi[j - 1].getX(), krogi[j - 1].getY()) > diagonala(krogi[j].getX(), krogi[j].getY())) {
					Krog temp = krogi[j - 1];
					krogi[j - 1] = krogi[j];
					krogi[j] = temp;
				}
			}
		}

		// Trikotniki
		for(int i = 0; i < trikotniki.length; i++) {
			trikotniki[i] = new Trikotnik(
					random(0, 900),
					random(0, 900),
					random(5, 40),
					Color.GREEN
			);
		}

		for(int i = 0; i < trikotniki.length; i++) {
			for(int j = 1; j < trikotniki.length - i; j++) {
				if(diagonala(trikotniki[j - 1].getX(), trikotniki[j - 1].getY()) > diagonala(trikotniki[j].getX(), trikotniki[j].getY())) {
					Trikotnik temp = trikotniki[j - 1];
					trikotniki[j - 1] = trikotniki[j];
					trikotniki[j] = temp;
				}
			}
		}

		// Kvadratniki
		for(int i = 0; i < kvadrati.length; i++) {
			kvadrati[i] = new Pravokotnik(
					random(0, 900),
					random(0, 900),
					random(5, 40),
					Color.RED
			);
		}

		for(int i = 0; i < kvadrati.length; i++) {
			for(int j = 1; j < kvadrati.length - i; j++) {
				if(diagonala(kvadrati[j - 1].getX(), kvadrati[j - 1].getY()) > diagonala(kvadrati[j].getX(), kvadrati[j].getY())) {
					Pravokotnik temp = kvadrati[j - 1];
					kvadrati[j - 1] = kvadrati[j];
					kvadrati[j] = temp;
				}
			}
		}

		for(Krog krog : krogi) {
			Circle circle = new Circle(
					krog.getX(),
					krog.getY(),
					krog.getVisina()
			);
			circle.setFill(krog.getColor());

			root.getChildren().add(circle);
			tNode[tNodePointer++] = circle;
		}

		for(Pravokotnik pravokotnik : kvadrati) {
			Rectangle rectangle = new Rectangle(
					pravokotnik.getX(),
					pravokotnik.getY(),
					pravokotnik.getVisina(),
					pravokotnik.getVisina()
			);
			rectangle.setFill(pravokotnik.getColor());

			root.getChildren().add(rectangle);
			tNode[tNodePointer++] = rectangle;
		}

		for(Trikotnik trikotnik : trikotniki) {
			double velikost = trikotnik.getVisina();

			Polygon polygon = new Polygon();
			polygon.getPoints().addAll(
					(double) trikotnik.getX(), (double) trikotnik.getY(),
					(double) trikotnik.getX(), (double) trikotnik.getY() + velikost,
					(double) trikotnik.getX() + velikost, (double) trikotnik.getY()
			);
			polygon.setFill(trikotnik.getColor());

			root.getChildren().add(polygon);
			tNode[tNodePointer++] = polygon;
		}

		// Ja
		for(Node a : tNode) {
			if(a instanceof Polygon p) {
				System.out.println("tala je poligon aka trikotnik ... ");
				System.out.println(p);
			} else if(a instanceof Rectangle r) {
				System.out.println("tala je kradvat ... ");
				System.out.println(r);
			} else if(a instanceof Circle c) {
				System.out.println("tala je krok ... ");
				System.out.println(c);
			}
		}

		Scene scene = new Scene(root, 1000, 1000);
		stage.setTitle("JavaFX Example");
		stage.setScene(scene);
		stage.show();
	}

	public double diagonala(int x, int y) {
		return Math.sqrt(x * x + y * y);
	}

	public int random(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
