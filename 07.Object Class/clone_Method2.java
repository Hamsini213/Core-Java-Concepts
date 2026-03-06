public class clone_method2 implements Cloneable {
    int a=100;
    int b=200;
    public static void main(String[] args) throws CloneNotSupportedException {
        clone_method c1= new clone_method2();
        clone_method c2= (clone_method)c1.clone();
        clone_method c3= (clone_method)c1.clone();
        System.out.println(c1.a+","+c1.b);
        System.out.println(c2.a+","+c2.b);
        System.out.println(c3.a+","+c3.b);
    }
} 
    
