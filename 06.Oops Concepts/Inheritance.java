// ! 1. Inheritance
package OopsConcepts;
//********************************PARENT CLASS********************************    
public class Inheritance 
{
    int a = 100;
    public void test1() 
    {
        System.out.println("From test 1");
    }
}

//********************************** CHILD CLASS********************************
class Inheritance1 extends Inheritance
{
    int b = 200;
    public void test2() 
    {
        System.out.println("From test 2");
    }
//********************************MAIN METHOD************************************
    public static void main(String[] args)
    {
        Inheritance I1 = new Inheritance();
        System.out.println(I1.a);
        I1.test1();
        System.out.println("*****************");
        Inheritance1 I2= new Inheritance1();
        System.out.println(I2.b);
        I2.test2();    
    }
}
