public class Naloga4do8 {
    public static void main(String[] args) {
        // karkol nej bi bla naloga 3
    }

    public static boolean seZacneZ(int[] tabela, int[] sezacnez) {
        int stevec_primerjav = 0;
        for (int i = 0; i < sezacnez.length;  i++) {
            stevec_primerjav++;
            if (tabela[i] != sezacnez[i]) {
                System.out.println(stevec_primerjav);
                return false;
            }
        }

        System.out.println(stevec_primerjav);
        return true;
    }

    public static boolean seKoncaZ(int[] tabela, int[] sekoncaz) {
        int stevec_primerjav = 0;
        for (int i = 0; i < sekoncaz.length;  i++) {
            stevec_primerjav++;
            if (tabela[tabela.length-1-i] != sekoncaz[i]) {
                System.out.println(stevec_primerjav);
                return false;
            }
        }
        System.out.println(stevec_primerjav);
        return true;
    }

    public static int dolz(int[] vektor) {
        // ?? i guess ??
        return vektor.length;
    }

    public static void spl(int[] tabela, int n) {
        int k = tabela.length/n; // velikost odseka
        for (int i = 0; i < n; i++) {
            for (int j = k*i; j < (k*i)+k; j++) {
                System.out.print(tabela[j]);
            }
            System.out.println();
        }
    }

    public static void spl(int[] tabela) {
        // tole nevem kaj sploh hoče od mene tkoda....

        for (int n: tabela) {
            int k = tabela.length/n; // velikost odseka
            for (int i = 0; i < n; i++) {
                for (int j = k*i; j < (k*i)+k; j++) {
                    System.out.print(tabela[j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
