public class Naloga1 {
	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		System.out.println(s1);

		byte[] ba = {65, 66, 67, 68, 69, 70, 71};
		String s2 = new String(ba);
		System.out.println(s2);

		char[] tc = {'F', 'U', 'G', 'L', 'O', 'V', 'Ž'};
		String s3 = new String(tc);
		System.out.println(s3);

		byte[] b2 = {'F', 'U', 'G', 'L', 'O', 'V', (byte) 'Ž'};
		String s4 = new String(b2);
		System.out.println(s4);
	}
}

// cast je potreben, ker Žja ni v ASCIIju
