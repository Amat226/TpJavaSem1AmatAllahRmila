package tp1;
import java.util.Scanner;
public class exer2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("donner un entier x");
        x = sc.nextInt();
        System.out.println("donner un entier x");
        y = sc.nextInt();
        System.out.println("x=" + x + "y "+ y);
        x = y++;
        System.out.println("x=" + x + "y "+ y);
        y = x--;
        System.out.println("x=" + x + "y "+ y);
        y=--x;
        System.out.println("x=" + x + "y "+ y);
    }
}