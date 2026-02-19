package methods;

public class thisStatement {
    int a;
    public thisStatement(int a)
    {
        this.a=a;
    }
    public static void main(String[] args)
     {
        thisStatement ob1 = new thisStatement(100);
        System.out.println(ob1.a);
        thisStatement ob2 = new thisStatement(200);
        System.out.println(ob2.a);  
    }
}
