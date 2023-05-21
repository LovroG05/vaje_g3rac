public class Naloga3 {
	public static List list = new List();
	public static Zig zig = new Zig();

	public static void main(String[] args) {
		int[][] tabL = list.getList();
		int[][] zigL = zig.getZig();

		int x = (int) (Math.random() * 8);
		int y = (int) (Math.random() * 7);

		for(int i = 0; i < zigL.length; i++) {
			for(int j = 0; j < zigL[i].length; j++) {
				tabL[x + i][y + j] = (int) (Math.random() * (zigL[i][j] - 1)) + 1;
			}
		}

		list.setList(tabL);
		list.printList();
	}
}
