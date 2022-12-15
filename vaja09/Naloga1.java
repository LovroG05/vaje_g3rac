public class Naloga1 {
    static final int RAZREDNA_KONSTANTA = 33;

    public static void main(String[] Args) {
        int a = 3, b = 99;
        System.out.println(a + RAZREDNA_KONSTANTA + b);
        System.out.println(naredi(a));
        System.out.println(naredi(a, b));
    }

    static char naredi(int a) {
        return (char) ('a' + a);
    }

    static int naredi(int a, int b) {
        if (b == 99)
            return 99;

        return b + a + 2 * RAZREDNA_KONSTANTA;
    }
}
