//! Inheritance Example
package OopsConcepts;
//***************************PARENT CLASS******************************* */
public class inheritanceexample
{
    int a = 10;
    static int x = 500;
    public static void test1() 
    {
        System.out.println("from static test 1 "); 
    }
    
}
//**************************CHILD CLASS******************************** */
 class inheritanceexample1 extends inheritanceexample
{
    int b = 20;
    static int y = 1000;
    public static void test2()
    {
        System.out.println("from static test 2");    
    }
//*********************MAIN METHOD********************************** */
    public static void main(String[] args)
    {
        inheritanceexample i1= new inheritanceexample();
        inheritanceexample1 i2 = new inheritanceexample1();
        System.out.println(i1.a);
        System.out.println(i1.x);
        i1.test1();
        System.out.println("-------------------------");
        System.out.println(i2.a);
        System.out.println(i2.x);
        i2.test1();
        System.out.println(i2.b);
        System.out.println(i2.y);
        i2.test2();   
    }  
}
