//! This call Statement
package methods;

public class thiscallStatement 
{
    public thiscallStatement()
    {
        System.out.println("From Constructor 1");
    }
    public thiscallStatement(int a)
    {
        this();
        System.out.println("From constructor 2");
    }
    public static void main(String[] args) {
        thiscallStatement ob1 = new thiscallStatement();
        
    }
}
