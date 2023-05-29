import java.util.Arrays;

public class Naloga3 {
	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		System.out.println(s1);

		byte[] ba = {65, 66, 67, 68, 69, 70, 71};
		String s2 = new String(ba);
		byte[] ba3 = s2.getBytes();
		System.out.println(Arrays.toString(ba3));

		char[] tc = {'F', 'U', 'G', 'L', 'O', 'V', 'Ž'};
		String s3 = new String(tc);
		char[] tc3 = s3.toCharArray();
		System.out.println(Arrays.toString(tc3));

		byte[] b2 = {'F', 'U', 'G', 'L', 'O', 'V', (byte) 'Ž'};
		String s4 = new String(b2);
		byte[] b2_3 = s4.getBytes();
		System.out.println(Arrays.toString(b2_3));
	}
}

/*
	a) Pretvorbe so možne povsod
	b) enake originalni tabeli, razen zadnja, kjer se pretvori v števila in ne črke
*/