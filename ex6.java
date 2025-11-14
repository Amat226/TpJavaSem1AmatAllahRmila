import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner jj=new Scanner(System.in);
        int n;
        System.out.println("donner un entier");
        n=jj.nextInt();
        while (n<0) {
            System.out.println("donner un entier");
            n=jj.nextInt();
        }
        for (int i = 1; i <=n; i++) {
            for (int j= 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        jj.close();
    }
}
