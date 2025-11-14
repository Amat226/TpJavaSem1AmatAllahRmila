package tp1;
public class exer111 {
    public static void main(String[] args) {
        int A=6 , B=21;
        Boolean Res;
        Res=A>B;
        /*false */
        System.out.println("A>B ? "+Res);
        Res=!(A>B);
        /*true */
        System.out.println("!(A>B) ? "+Res);
        Res=A<B;
        /*true */
        System.out.println("A<B ? "+Res);
        Res=A==B;
        /*false */
        System.out.println("A==B ? "+Res);
        Res=A!=B;
        /*true */
        System.out.println("A!=B ? "+Res);
        Res=(A<B)&(A==B);
        /*false */
        System.out.println("(A<B)&(A==B) ? "+Res);
        Res=(A<B)|(A==B);
        /*true */
        System.out.println("(A<B)|(A==B) ? "+Res);
        Res=(A<B)^(A==B);
        /*true */
        System.out.println("(A<B)^(A==B) ? "+Res);
        Res=A<B?true:false;
        /*true */
        System.out.println("A<B?true:false ? "+Res);
        /*true */
    }
}
