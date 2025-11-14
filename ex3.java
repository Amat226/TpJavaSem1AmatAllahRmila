import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,m;
        System.out.println("Donner nombre compris entre 1 et 10");
        n=sc.nextInt();
        System.out.println("table de multiplication :");
        for(i=0;i <=10;i++){
            m=n*i;
            System.out.println(n+"*"+i+"="+m);
        }
        sc.close();
    }
}