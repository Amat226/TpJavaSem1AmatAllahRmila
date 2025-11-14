package tpchaine;

import java.util.StringTokenizer;
public class exercice3 {
    public static void main(String[] args) {
        String text1="Bonjour les etudiants,bienvenue en java";
        StringTokenizer  st1= new StringTokenizer(text1);
        System.out.println("decoupage du texte en mots");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        System.out.println("le texte principale est :"+text1);
    }
}
