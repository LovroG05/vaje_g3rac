import java.util.Arrays;
import java.util.Random;

public class Naloga7 {
	static final char[] samoglasniki = {'A', 'E', 'I', 'O', 'U'};
	static final char[] soglasniki = {'B', 'C', 'Č', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'Š', 'T', 'V', 'Z', 'Ž'};

	public static void main(String[] args) {
		Random random = new Random();
		char[] nakljucno = new char[8];

		for(int i = 0; i < nakljucno.length; i++) {
			if(i % 2 == 0) {
				nakljucno[i] = soglasniki[random.nextInt(soglasniki.length - 1)];
			} else {
				nakljucno[i] = samoglasniki[random.nextInt(samoglasniki.length - 1)];
			}
		}

		System.out.println(Arrays.toString(nakljucno));
	}
}

