import java.util.Random;

public class RacLib {
    // Konstante
    public static final int[] FOO = {1, 2, 3, 4, 4, 3, 5, 6, 7, 1, 2, 4, 3};

    private static final Random rand = new Random();

    private RacLib() {
    }

    public static void izpisiTabelo(int[] tabela) {
        if(tabela.length == 0) {
            System.out.println("ni tabele");
            return;
        }

        for(int i = 0; i < tabela.length - 1; i++) {
            System.out.print(tabela[i]);
            System.out.print(", ");
        }

        System.out.println(tabela[tabela.length - 1]);
    }

    public static void izpisiTabelo(float[] tabela) {
        if(tabela.length == 0) {
            System.out.println("ni tabele");
            return;
        }

        for(int i = 0; i < tabela.length - 1; i++) {
            System.out.print(tabela[i]);
            System.out.print(", ");
        }

        System.out.println(tabela[tabela.length - 1]);
    }

    public static void izpisiTabelo(String sporocilo, int[] tabela) {
        System.out.print(sporocilo);
        izpisiTabelo(tabela);
    }

    public static void izpisiTabelo(String sporocilo, float[] tabela) {
        System.out.print(sporocilo);
        izpisiTabelo(tabela);
    }

    public static int[] randomTabela(int dolzina) {
        int[] toReturn = new int[dolzina];

        for(int i = 0; i < dolzina; i++) {
            toReturn[i] = (int) (Math.random() * 10);
        }

        return toReturn;
    }

    public static int randomBetween(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }
}