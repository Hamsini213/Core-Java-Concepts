//! method with argument
package methods;

public class methodwithargument {
    public static void multiply(int a,float b,double c)// todo----formal argument----
     {
        double product=a*b*c;
        System.out.println("product"+product);
    }
    public static void main(String[] args) {
        multiply(25, 65.2f, 200000);// todo ----Actual argument-----
    }
}
