import java.util.Arrays;
public class DemoUtMetode {
   public static void main(String[] args){
       
       System.out.println(N1.jeVZaporedjuNa(new int[]{1,2,3,5,7,8,9,0,1,2}, new int[]{5,7,8,9,0},3));
       
       System.out.println(N1.seKoncaZ(new int[]{1,2,3,5,7,8,9,0,1,3}, new int[]{0,1,2,3}));
       
       System.out.println(Arrays.toString(N1.vrniPodZaporedje(new int[]{1,2,3,5,7,8,9,0,1,2},1,0)));
       
       System.out.println(N1.seZacneZ(new int[]{1,2,3,5,7,8,9,0,1,2},new int[]{1,2,3}));
       
   } 
}