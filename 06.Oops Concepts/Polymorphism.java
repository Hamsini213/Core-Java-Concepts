//! 2.Polymorphism
package OopsConcepts;
//********************PARENT CLASS**************************** */
class bank 
{
    public float RateOfIntrest()
    {
        return 0.0f;
    } 
}
//********************CHILD CLASS******************************** */
class ICIC extends bank 
{
    public float RateOfIntrest()
    {
        return 2.5f;
    }   
}
//********************CHILD CLASS 1 ******************************  */ 
 class Canara extends bank
{
     public float RateOfIntrest()
    {
        return 5.5f;
    }
    
}
//*********************MAIN METHOD********************************* */
public class Polymorphism 
{
    public static void main(String[] args) 
    {
      bank b1 = new ICIC();
      bank b2 = new Canara();
      for (int i = 0; i < 3; i++)
    {
        bank[]x={b1,b2};
        System.out.println(x[i].RateOfIntrest());  
    }   
    }
}
