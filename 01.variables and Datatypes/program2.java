//! post and pre increment operator
public class program2 {
    public static void main(String[] args) {
        int a =20;
        int b = 30;
        int c = a++ + --b + ++a;
        int d = c++ + b-- + a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
