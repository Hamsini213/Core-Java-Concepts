//! Abstraction
package OopsConcepts;
//*************************************************** */
public abstract class m1 {
    public abstract void test1();
    public abstract void test2();
    public m1()
    {
        System.out.println("ABCD");
    }
//*********************************************************** */
public class m2 extends m1 {
    public void test1()
    {
        System.out.println(1);
    }
    public void test2()
    {
        System.out.println(2);
    }
    public m2(){
        System.out.println("XYZ");
    }
    public static void main(String[] args) {
        m2 ob = new m2();
        ob.test1();
        ob.test2();
        
    }
    
}
}

