import java.util.Arrays;

public class Naloga8 {
	public static void main(String[] args) {
		int[] t1 = {1, 2, 3, 4};
		int[] t2 = t1;

		t2[1] = 6;
		t2[3] = 9;
		int i = 0;

		System.out.print("Prva tabela: ");
		for(i = 0; i < t1.length; i++) {
			System.out.print(t1[i] + " ");
		}

		System.out.println();
		System.out.print("Druga tabela: ");
		for(i = 0; i < t2.length; i++) {
			System.out.print(t2[i] + " ");
		}

		System.out.println();
		System.out.println();

		mainFixed();
	}

	public static void mainFixed() {
		int[] t1 = {1, 2, 3, 4};
		int[] t2 = Arrays.copyOf(t1, t1.length);

		t2[1] = 6;
		t2[3] = 9;
		int i = 0;

		System.out.print("Prva tabela: ");
		for(i = 0; i < t1.length; i++) {
			System.out.print(t1[i] + " ");
		}

		System.out.println();
		System.out.print("Druga tabela: ");
		for(i = 0; i < t2.length; i++) {
			System.out.print(t2[i] + " ");
		}
	}
}

/*
	a)
		t1 = {1, 2, 3, 4}
		t2 = t1 // ker smo v objektnem svetu ima t2 enako referenco kot t1, zato je t2 dobesedno t1
		---
		t1/t2 = {1, 6, 3, 4}
		---
		t1/t2 = {1, 6, 3, 9}

	b) Program izpiše 2x isto tabelo
	c) mainFixed/0
 */