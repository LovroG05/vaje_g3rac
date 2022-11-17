public class naloga11 {
    public static void main(String args[]) {
        System.out.print("+");
        for (int i = 0; i != 78; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        for (int j = 0; j != 23; j++) {
            System.out.print("|");
            for (int k = 0; k != 78; k++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("+");
        for (int i = 0; i != 78; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
