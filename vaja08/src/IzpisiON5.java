import java.util.Random;

public class IzpisiON5 {
    static void izpisiKxy(int odmik) {
        System.out.printf("%" + odmik + "s", " ");
        System.out.println("******");
        System.out.printf("%" + odmik + "s", " ");
        System.out.println("*    *");
        System.out.printf("%" + odmik + "s", " ");
        System.out.println("* ** *");
        System.out.printf("%" + odmik + "s", " ");
        System.out.println("* ** *");
        System.out.printf("%" + odmik + "s", " ");
        System.out.println("*    *");
        System.out.printf("%" + odmik + "s", " ");
        System.out.println("******");
        System.out.println("");

    }

    public static void main(String[] args) {
        for (int i = 0; i < 35; i++) {
            izpisiKxy(new Random().nextInt(90 - 6) + 6);
        }
    }
}
