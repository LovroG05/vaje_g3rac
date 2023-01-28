import java.util.Arrays;

public class Naloga1 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(vrniNtoPodzaporedjeDolzineM(1, 3, RacLib.FOO)));
	}

	private static int[] vrniNtoPodzaporedjeDolzineM(int n, int dolzina, int[] tabela) {
		int[] toReturn = new int[dolzina];

		if(tabela.length < dolzina * n) {
			return null;
		}

		for(int i = 0; i < dolzina; i++) {
			toReturn[i] = tabela[i + n * dolzina];
		}

		return toReturn;
	}
}
