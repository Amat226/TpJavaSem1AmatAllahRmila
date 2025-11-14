import java.util.Scanner;

public class exx3 {
    public static int lecture_n(){
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.println("dooner un entier");
            n=sc.nextInt();
        } while(n <0);
        sc.close();
        return n;
    }
    public static int puissance(int a,int b){
        int p=1;
        for (int i=0;i<=b;i++) {
            p=p*a;
        }
        return p;
    }
    public static int calculesomme( int n){
        int s=0;
        for (int i=1; i<=n; i++) {
            s=s+puissance(i,2);
        }
        return s;
    }
    public static void main(String[] args) {
        
    }
}
