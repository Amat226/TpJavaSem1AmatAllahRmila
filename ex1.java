import java.util.Scanner;
public class ex1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float t;
        System.out.println("Donner la temperature");
        t=sc.nextFloat();
        if(t<=0){
            System.out.println("Glace");
        }
        else if((0<t)&(t<=100)){
            System.out.println("Eau");
        }
        else{
            System.out.println("Vapeur");
        }
        sc.close();
    }
    
}
