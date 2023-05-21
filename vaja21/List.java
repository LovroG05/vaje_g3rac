public class List {
	private int[][] list = new int[10][12];

	public List() {
	}

	public int[][] getList() {
		return list;
	}

	public void setList(int[][] list) {
		this.list = list;
	}

	public boolean jeStemplan() {
		for(int i = 6; i <= 8; i++) {
			for(int j = 8; j <= 10; j++) {
				if(list[i][j] != 0) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean jeZigCeloten(Zig zig) {
		for(int i = 6; i <= 8; i++) {
			for(int j = 8; j <= 10; j++) {
				if(list[i][j] != zig.getA()) {
					return false;
				}
			}
		}

		return true;
	}

	public void printList() {
		for(int[] ints : list) {
			for(int anInt : ints) {
				System.out.print(anInt + " ");
			}

			System.out.println();
		}
	}
}