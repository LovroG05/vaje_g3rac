import java.util.Arrays;

public class Zig {
	private final int[][] zig = new int[3][3];
	private final int a = (int) ((Math.random() * 10) + 1);

	public Zig() {
		for(int[] ints : zig) {
			Arrays.fill(ints, a);
		}
	}

	public int[][] getZig() {
		return this.zig;
	}

	public int getA() {
		return a;
	}
}
