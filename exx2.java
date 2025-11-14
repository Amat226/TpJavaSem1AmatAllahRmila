

import java.util.Scanner;

public class exx2 {
    public static int lecture_n ( int n){
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("dooner un entier");
            n=sc.nextInt();
        } while(n <0);
        return n;
    }
    public static int compter(String ch){
        int nb=0;
        for (int i = 0; i < ch.length(); i++) {
            nb+=1;
        }
        return nb;
    }
    public static void main(String[] args) {
        String ch="";
        int n=0;
        ch=String.valueOf(lecture_n(n));
        System.out.println(compter(ch));
    }
}
