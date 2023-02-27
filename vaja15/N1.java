import java.util.Arrays;

public class N1 {
    static int N = (int) ((Math.random()*70) + 30);
    
    public static void main (String[] arg) {
        int[] t1 = new int[N];
        int[] t2 = new int[4];
        for (int i = 0; i < t1.length; i++) {
            t1[i] = (int) (Math.random()*9);
        }
        for (int i = 0; i < t2.length; i++) {
            t2[i] = (int) (Math.random()*9);
        }
        //System.out.println(Arrays.toString(t1));
        
        /*System.out.println(Arrays.toString(vrniPodZaporedje(t1, 1, 2)));
        izpisiZaporedja(t1, true); --ne dela
        System.out.println(seZacneZ(t1, t2));
        System.out.println(seKoncaZ(t1, t2));
        System.out.println(jeVZaporedjuNa(t1,t2,4));    */
    }
    
    static int[] vrniPodZaporedje (int[] tab, int vr_prvi,int vr_zadnji) {
        
        int[] tab1 = new int[N];
        int l = 0;
        int k = 0;
        
        for(int i = 0; i < tab.length; i++) {
            if (tab[i] == vr_prvi && l == 0) {
                for (int j = 0; j < tab.length && l == 0; j++) {
                    tab1[j] = tab[i + j];
                    k++;
                    if(tab1[j] == vr_zadnji)
                        l++;
                }
            }
        }
        
        int[] tab2 = Arrays.copyOf(tab1, k);
        return tab2;
    }
    
    public static void izpisiZaporedja(int[] tab, boolean padajoce) {
        
        int[] tab1 = new int[N];
        int k = 0;
        
        if(padajoce) {
            for(int i = 0; i < tab.length; i++) {
                if(tab[i+1] <= tab.length) {
                if(tab[i] > tab [i+1] && tab[i+1]+1 == tab[i]) {
                    for(int j = 0; j < tab.length; j++) {
                        tab1[j] = tab[i];
                        k++;
                    }
                }
            }
            }
            int[] tab2 = Arrays.copyOf(tab1, k);
            System.out.println(Arrays.toString(tab2));
        }
    }
    
    public static boolean seZacneZ(int[] tab, int[] vzorec) {
        
        int l = 0;
        
        for(int i = 0; i < vzorec.length; i++) {
            if(vzorec[i] == tab[i])
                l++;
        }
        
        if(l == vzorec.length)
        return true;
        
        return false;
    }
    
    public static boolean seKoncaZ(int[] tab, int[] vzorec) {
        
        int l = 0;
        int j = tab.length - 1;
        
        for(int i = vzorec.length - 1; i == 0;i--) {
            if(vzorec[i] == tab[j])
            l++;
            j--;
        }
        if(l == vzorec.length)
        return true;
        
        return false;
    }
    
    public static boolean jeVZaporedjuNa(int[] zaporedje, int[] vzorec, int ind) {
        for (int i = 0; i < vzorec.length; i++) {

            if (zaporedje[i+ind] != vzorec[i]) 
            return false;
        }

        return true;
    }
}