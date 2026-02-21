package OopsConcepts;
//**************************PARENT CLASS******************************* */
public class superclass
{
    int a;
    public superclass()
    {
        System.out.println("from class of superclass ");
    }
    public superclass(int x)
    {
        System.out.println("from class 2 of superclass");
    }
}
//*************************CHILD CLASS*********************************** */
class superclass1 extends superclass
{
    int b;
    public superclass1()
    {
        super();
        System.out.println("from class 1 of superclass1");
    }
    public superclass1(int y,int z)
    {
        super(y);
        System.out.println("from class 2 of superclass");
    }
//**************************MAIN METHOD****************************** */
    public static void main(String[] args) 
    {
      superclass1 s1 = new superclass1(100,200);
      System.out.println(s1.a);
      System.out.println(s1.b);

        
    }
    
}
