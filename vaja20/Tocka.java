/**
 * ravninska točka, omejena na [-100,100] od izhodišča v smereh x in y
 * zna podati svojo oddaljenost od koordinatnega izhodišča
 * zna se vizualizirati v eni izmed oblik (x,y) ali {x,y}
 */
public class Tocka {
	private int x;
	private int y;

	public Tocka(int x, int y) {
		setX(x);
		setY(y);
	}

	public double getOddaljenost() {
		return Math.sqrt(x * x + y * y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(-100 < x && x < 100) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(-100 < y && y < 100) {
			this.y = y;
		}
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
