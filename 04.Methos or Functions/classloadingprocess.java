package methods;

public class classloadingprocess {
    static int a = test1(10,20);
    static int b = test1 (10,20)+ test2(15,30);
    public static int test1(int m ,int n) {
        return m+n+test2(m, n); 
    }
    public static int test2(int p,int q) {
        return p+q+25; 
    }
    public static void main(String[] args) {
        System.out.println(classloadingprocess.a);
        System.out.println(classloadingprocess.b);
    }
}
