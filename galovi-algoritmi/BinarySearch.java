public class BinarySearch {
    public static int binarySearch() {

        int low = 0;
        int high = Main.tabela.length - 1;

        while (low <= high) {

            int midPos = (low + high) / 2;
            int midNum = Main.tabela[midPos];

            if (Main.numToFind == midNum) {
                return midPos;
            }

            if (Main.numToFind < midNum) {
                high = midPos - 1;
            } else {
                low = midPos + 1;
            }

        }

        return -1;
    }
}
