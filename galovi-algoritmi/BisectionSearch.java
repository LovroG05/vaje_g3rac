public class BisectionSearch {
    public static int bisectionSearch() {

        int mid = Main.tabela.length / 2;

        if (Main.numToFind == Main.tabela[mid]) return mid;

        for (int i = mid; i != 0 && Main.numToFind < Main.tabela[mid]; i--) {

            if (Main.numToFind == Main.tabela[i]) return i;

        }

        for (int i = mid; i != Main.tabela.length && Main.numToFind > Main.tabela[mid]; i++) {

            if (Main.numToFind == Main.tabela[i]) return i;

        }

        return -1;
    }
}
