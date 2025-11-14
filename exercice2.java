package tpchaine;

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase :");
        String ch2=sc.nextLine();
        StringBuffer ch=new StringBuffer(ch2);
        System.out.println("le contenu de StringBuffer est "+ch);
    }
}
