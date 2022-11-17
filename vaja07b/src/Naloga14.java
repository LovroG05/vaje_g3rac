public class Naloga14 {
    // bug: če je višina %2 enako 0 pol ne izpiše prou
    // fix: se mi ni lih dal
    public static void main(String[] args) {
        int višina = Integer.parseInt(args[2]);
        int višina1 = višina + 2;
        int širina1 = višina1 * 3;

        String k = args[1];

        for (int i = 0; i < širina1; ++i) {
            System.out.print(k);
        }
        System.out.println("");

        for (int i = 1; i <= ((višina/2)+1); ++i) {
            int charnausakistrani = (širina1/2 - i)+1;
            for (int j = 0; j < charnausakistrani; ++j) {
                System.out.print(k);
            }

            for (int j = 0; j < (širina1-(charnausakistrani*2)); ++j) {
                System.out.print(" ");
            }

            for (int j = 0; j < charnausakistrani; ++j) {
                System.out.print(k);
            }
            System.out.println("");
        }

        for (int i = višina/2; i > 0; --i) {
            int charnausakistrani = (širina1/2 - i)+1;
            for (int j = 0; j < charnausakistrani; ++j) {
                System.out.print(k);
            }

            for (int j = 0; j < (širina1-(charnausakistrani*2)); ++j) {
                System.out.print(" ");
            }

            for (int j = 0; j < charnausakistrani; ++j) {
                System.out.print(k);
            }
            System.out.println("");
        }

        for (int i = 0; i < širina1; ++i) {
            System.out.print(k);
        }
        System.out.println("");
    }
}
