import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner j=new Scanner(System.in);
        int n,i,f=1;
        do {
            System.out.println("donner un entier");
            n=j.nextInt(); 
        } while (n<0);
        if(n==0){
            System.out.println("le factorille de 0 est 1");
        }
        else{
            for(i=1;i<=n;i++){
            f=f*i;
        }
        }
        System.out.println(f);
        j.close();
    }
}