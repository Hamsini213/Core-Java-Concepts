// ! 1.Upcasting
// ---------------------------------------------------------------------
public class upcasting 
{
    int x = 100;
    public void test1() 
    {
        System.out.println("test1"); 
    }
}
// ----------------------------------------------------------------------
class Innerupcasting extends upcasting 
{
    int y = 200;
    public void test2()
    {
        System.out.println("test2"); 
    } 
    public static void main(String[] args) 
    {
        Innerupcasting I1 = new Innerupcasting ();
        System.out.println(I1.x);
        I1.test1();
        System.out.println(I1.y);
        I1.test2();

        upcasting I2 = I1;//! Upcasting
        System.out.println(I2.x);
        I2.test1(); 
    } 
}
// Outputs:
// 100
// test1
// 200
// test2
// 100
// test1
