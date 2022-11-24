public class Naloga2 {
        static void ispis(int i) {
                int odmik = i;
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
        public static void main(String[] args){
            ispis(20);
            ispis(20);
            ispis(20);
        }
    }
