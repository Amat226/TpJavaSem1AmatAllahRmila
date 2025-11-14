import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        int m,an;
        do {
           System.out.println("donner le moins");
           m=h.nextInt(); 
        } while (m>12 || m<1);
        System.out.println("donner l'année");
        an=h.nextInt();
        switch (m) {
            case 1,3,5,7,8,10,12:
                System.out.println("En"+an+", le mois n°"+m+"a 31jours");
                break;
            case 4,6,9,11:
                System.out.println("En"+an+", le mois n°"+m+"a 30jours");
                break;
            case 2:
                if ((an%4==0 && an%100!=0) || an%400!=0) {
                    System.out.println("En"+an+", le mois n°"+m+"a 29jours");
                }
                else{
                    System.out.println("En"+an+", le mois n°"+m+"a 28jours");
                }
                break;
        }
    }
}
