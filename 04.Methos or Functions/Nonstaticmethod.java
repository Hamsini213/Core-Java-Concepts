package methods;

public class Nonstaticmethod {
    int a = 100;
    public void test() {
        System.out.println("from test");
    }
    public static void main(String[] args) {
    Nonstaticmethod ob1= new Nonstaticmethod();
    System.out.println(ob1);
    System.out.println(ob1.a);
    ob1.test();
    System.out.println("----------");
    Nonstaticmethod ob2= new Nonstaticmethod();
    System.out.println(ob1);
    System.out.println(ob2.a);
    ob1.test();
    System.out.println("----------");

    }   
}
