package tpchaine;

import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch,ch1="";
        char c;
        System.out.println("donner une chaine");
        ch=sc.nextLine();
        while (ch.length()>30) {
            System.out.println("donner une chaine");
            ch=sc.nextLine();
        }
        for (int i = 0; i < ch.length(); i++) {
            c=Character.toUpperCase(ch.charAt(i));
            if (c=='X' || c=='Z' || c=='Y'){
                ch1=ch1+(char) ((int) ch.charAt(i) - 23);
            }
            else{
                ch1=ch1+(char) ((int) ch.charAt(i) + 3);
            }
        }
        System.out.println(ch1);
    }
}
