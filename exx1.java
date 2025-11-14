
import java.util.Scanner;
public class exx1 {
     Scanner sc=new Scanner(System.in);
    public static int lecture_n( ){
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.println("dooner un entier");
            n=sc.nextInt();
        } while(n <0);
        sc.close();
        return n;
    }
    public static boolean estpaire(int a) {
         boolean test=true;
        if (a%2==0){
            test=true;
        }
        else{
            test=false;
        }
        return test;
    }
    public static void main(String[] args) {
        int n;
        for (int j = 0; j<= 9; j++) {
            n=lecture_n();
            if (estpaire(n)==true) {
                System.out.println(n+"est paire");
            }
            else{
                System.out.println(n+"est impaire");
            }
        }
    }
}
