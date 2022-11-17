public class naloga10 {
    public static void main(String args[]){
        int[] arrayY;
        arrayY = new int[15];
        for (int j = 0; j < arrayY.length; j++) {
            arrayY[j] = ((int)(Math.random() * 80) + 1);
        }
        char[] arrayChar = {'a', 'b', 'c' , 'd', 'e', 'f'
                , 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's'
                , 't', 'w', 'x', 'y', 'z'};
        char ch;
        for (int k = 0; k < 15; k++){
            for (int c = 0; c != arrayY[k]; c++){
                System.out.print(" ");
            }
            ch = arrayChar[(int) (Math.random() * arrayChar.length) + 0];
            System.out.println(ch);
        }
    }
}
