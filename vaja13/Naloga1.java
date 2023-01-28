public class Naloga1 {
    public static void main(String[] args) {
        int[] zaporedje = {1,2,4,6,8,9,12,15,16,19,21};

        zaporednoIskanje(zaporedje, 10);
        binarnoIskanje(zaporedje, 10, 0, zaporedje.length-1, 0);
    }

    /*
        loopa čez zaporedje in preveri, če element ustreza iskanemu
     */
    public static void zaporednoIskanje(int[] tabela, int iskani) {
        int stevec = 0;
        for (int j : tabela) {
            stevec++;
            if (j == iskani) {
                break;
            }
        }

        System.out.println(stevec);
    }

    /*
        Ta metoda deluje rekurzivno.
        Ob vsakem klicu razdeli zaporedje na pol in preveri, če je trenutni element večji ali manjši od iskanega.
        Temu primerno se odloči katero polovico naj preveri naslednjo.
     */
    public static int binarnoIskanje(int[] tabela, int iskani, int l, int r, int stevec) {
        stevec++;
        if (r >= l) {
            int mid = l + (r-l)/2;

            if (tabela[mid] == iskani) {
                System.out.println(stevec);
                return mid;
            }

            if (tabela[mid] > iskani) {
                return binarnoIskanje(tabela, iskani, l, mid-1, stevec);
            }

            return binarnoIskanje(tabela, iskani, mid+1, r,  stevec);
        }

        System.out.println(stevec);
        return -1;
    }
}
