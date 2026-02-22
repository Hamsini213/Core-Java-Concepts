//! Method Overidding
package OopsConcepts;
//*****************PARENT CLASS**************************** */
public class Methodoveridding 
{
   public void test() 
   {
    System.out.println(1);
   } 
}
//***************CHILD CLASS******************************** */
 class Methodoveridding1 {
    public void test(){
        System.out.println(2);
    }
//***************MAIN METHOD********************************** */ 
   public static void main(String[] args) {
    Methodoveridding1 M1= new Methodoveridding1();
    M1.test();
    Methodoveridding M2 = new Methodoveridding();
    M2.test();
    
   } 
}
