import java.util.Arrays;

public class Naloga12 {
	public static void main(String[] args) {
		String[] t = {"pablik", "statik", "vojid", "mejn"};
		razvrstiTabNizovLeksikalno(t);
		System.out.println(Arrays.toString(t));

		t = new String[]{"pablik", "statik", "vojid", "mejn"};
		razvrstiTabNizovPoDolziniNizov(t);
		System.out.println(Arrays.toString(t));
	}

	public static void razvrstiTabNizovLeksikalno(String[] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = i + 1; j < t.length; j++) {
				if(t[i].compareTo(t[j]) > 0) {
					String temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}
	}

	public static void razvrstiTabNizovPoDolziniNizov(String[] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = i + 1; j < t.length; j++) {
				if(t[i].length() > t[j].length()) {
					String temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}

		for(String s : t) {
			System.out.println(s);
		}
	}
}
