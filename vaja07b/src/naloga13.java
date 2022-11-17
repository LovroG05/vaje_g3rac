import java.util.Scanner;

public class naloga13 {
    public static void main(String args[]) {
        Scanner startheight = new Scanner(System.in);
        int startx = startheight.nextInt();
        Scanner startwidth = new Scanner(System.in);
        int starty = startwidth.nextInt();
        Scanner height = new Scanner(System.in);
        int x = height.nextInt();
        Scanner width = new Scanner(System.in);
        int y = width.nextInt();
        if (x > 80 || y > 25) {
            for (int n = 0; n < 25; n++) {
                for (int m = 0; m < 80; m++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
        } else {

            for (int i = 0; i < 25; i++) {
                if (starty == i) {
                    for (int j = 0; j < startx; j++) {
                        System.out.print("+");
                    }
                    for (int k = 0; k < x; k++) {
                        System.out.print(" ");
                    }
                    if (startx + x < 80) {
                        for (int q = startx + x; q < 80; q++) {
                            System.out.print("+");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("");
                    }
                } else if (i >= startx && i <= startx + x) {
                    for (int j = 0; j < startx; j++) {
                        System.out.print("+");
                    }
                    for (int k = 0; k < x; k++) {
                        System.out.print(" ");
                    }
                    if (startx + x < 80) {
                        for (int q = startx + x; q < 80; q++) {
                            System.out.print("+");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("");
                    }
                } else {
                    for (int j = 0; j < 80; j++) {
                        System.out.print("+");
                    }
                    System.out.println("");
                }
            }
        }
    }
}