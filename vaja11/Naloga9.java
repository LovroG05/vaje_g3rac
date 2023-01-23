import java.util.Arrays;

public class Naloga9 {
	public static void main(String[] args) {
		int[] tabOsno = {1, 2, 3, 4, 4, 3, 5, 6, 7, 1, 2, 4, 3};
		int a = 4;

		int[] rezt1;
		int[] rezt2;

		int rez1Size = 0;
		int rez2Size = 0;

		for(int i = 0; i < tabOsno.length; i++) {
			if(i % (a * 2) < a) {
				rez1Size++;
			} else {
				rez2Size++;
			}
		}
		rezt1 = new int[rez1Size];
		rezt2 = new int[rez2Size];


		razbij2(tabOsno, a, rezt1, rezt2);

		System.out.println(Arrays.toString(rezt1));
		System.out.println(Arrays.toString(rezt2));
	}

	private static void razbij2(int[] tabOsno, int a, int[] rez1, int[] rez2) {
		int rez1Pointer = 0;
		int rez2Pointer = 0;

		for(int i = 0; i < tabOsno.length; i++) {
			if(i % (a * 2) < a) {
				rez1[rez1Pointer] = tabOsno[i];
				rez1Pointer++;
			} else {
				rez2[rez2Pointer] = tabOsno[i];
				rez2Pointer++;
			}
		}
	}
}
