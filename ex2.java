import java.util.Scanner;
public class ex2{
    public static void main(String[] args){
        Scanner m=new Scanner(System.in);
        int n;
        do{
            System.out.println("Entrez le nemuro :");
            n=m.nextInt();
        }
        while(n<1 & n>12);
        switch (n) {
            case 12,1,2:
                System.out.println("saison hiver");
                break;
            case 3,4,5:
                System.out.println("saison printemps");
                break;
            case 6,7,8:
                System.out.println("saison été");
                break;
            case 9,10,11:
                System.out.println("saison automne");
                break;
        }
        m.close();
}
}