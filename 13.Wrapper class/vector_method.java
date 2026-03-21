import java.util.Vector;

public class vector_method {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("java");
        v.add("python");
        v.add("mysql");
        System.out.println(v);
        System.out.println("*------------------------------------*");
        Vector v1 = new Vector(v);
        System.out.println(v1);
        v1.remove(1);
        System.out.println(v1);
    }
}
