import java.lang.Math;

public class Naloga3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int večkratniki = 0;
        for (int i = 0; i < 50; i++) {
            int r = (int)(Math.random() * (30 - 5 + 1) + 5);
            if (r % n == 0) {
                večkratniki++;
            }
        }
        System.out.printf("Najdenih je bilo %d večkratnikov števila %d", večkratniki, n);
    }
}
