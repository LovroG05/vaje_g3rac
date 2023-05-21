public class Naloga2 {
	public static List list = new List();
	public static Zig zig = new Zig();

	public static void main(String[] args) {
		if(!list.jeStemplan()) {
			int[][] tabL = list.getList();
			int[][] zigL = zig.getZig();

			for(int i = 0; i < zigL.length; i++) {
				for(int j = 0; j < zigL[i].length; j++) {
					tabL[6 + i][8 + j] = (int) (Math.random() * (zigL[i][j] - 1)) + 1; // odštejemo, da simuliramo ne "celoten" oddtis
				}
			}

			list.setList(tabL);
		}

		list.printList();
		System.out.println("Je zig celoten: " + list.jeZigCeloten(zig));
	}
}
