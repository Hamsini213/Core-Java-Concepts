//! Method Hiding / Shadow Method
package OopsConcepts;
//******************PARENT CLASS***************************** */
public class Methodhiding 
{
    public static void test()
     {
        System.out.println(1);
        
    }
}
//****************CHILD CLASS********************************** */
 class Methodhiding1 {
    public static void test() 
    {
        System.out.println(2);
        
    }
    //***********MAIN METHOD*********************************** */
public static void main(String[] args)
 {
    Methodhiding1 ob = new Methodhiding1();
    Methodoveridding ob1 = new Methodoveridding();
    ob.test();
    ob1.test();   
}
    
}
