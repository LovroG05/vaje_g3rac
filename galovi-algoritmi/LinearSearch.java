public class LinearSearch {
    public static int linearSearch() {

        for (int i = 0; i < Main.tabela.length - 1; i++) {

            if (Main.numToFind == Main.tabela[i]) {
                return i;
            }

        }

        return -1;
    }
}
