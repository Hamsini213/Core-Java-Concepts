//!method call statement
package methods;

public class methodcallstatement {
    public static void main(String[] args) {
        System.out.println("From main begin");
        test();//todo ----method call Statement----
        System.out.println("From main end");
    }
    public static void test() {
        System.out.println("From test");
    }
}
