package methods;

public class Staticvariable {
    static int a = 500;
    public static void main(String[] args) {
        System.out.println(a);
        test();
    }
    public static void test() {
        System.out.println(a);  
    } 
}
