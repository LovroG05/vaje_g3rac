/**
 * @author Jurij Fortuna
 * vir: https://github.com/LovroG05/vaje_g3rac/tree/master/vaja16
 */
public class Naloga1 {
	private static int prioR = 2;
	private static int neprioR = 3;

	private static int[] prioritetna = {99, 98, 97, 0};
	private static int[] nePrioritetna = {1, 2, 3, 4, 0};

	public static void main(String[] args) {
		System.out.println(pop());
		push(3, true);
		System.out.println(pop());
	}

	private static int pop() {
		int toReturn;

		if(prioR == 0) {
			toReturn = nePrioritetna[neprioR];

			if(neprioR > 0) {
				neprioR--;
			}
		} else {
			toReturn = prioritetna[prioR--];
		}

		return toReturn;
	}

	private static void push(int a, boolean prioriteta) {
		if(prioriteta) {
			if(prioR < prioritetna.length - 1) {
				prioritetna[++prioR] = a;
			}
		} else {
			if(neprioR < nePrioritetna.length - 1) {
				nePrioritetna[++neprioR] = a;
			}
		}
	}
}
