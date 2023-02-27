import java.util.Arrays;
public class N2 {
    private final static int N=5;
    private static int[] sklad = new int[N];
    public static int kazalec = 0;
    public static void main(String[] arg) {
        
        isEmpty();
        push(3);
        push(3);
        push(5);
        push(2);
        
        System.out.println(pop());
        
        push(1);
        push(4);
        System.out.println(Arrays.toString(sklad));
        
        System.out.println(pop());
        
    }

   public static boolean isEmpty() {
       for(int i = 0; i < sklad.length; i++) {
           if(sklad[i] != 0)
           return false;
        }
       
       return true;
    }
   
   public static int pop() {
       
       if(kazalec != 0)
       kazalec--;
       int b = sklad[kazalec];
       
       return b;
    }
    
   public static void push(int kaj){
       sklad[kazalec] = kaj;
       kazalec++;
       
    }
}
