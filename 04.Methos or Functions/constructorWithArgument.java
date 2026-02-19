//! constructor With Argument
package methods;

public class constructorWithArgument {
    int a,b;
    public constructorWithArgument(int x, int y){
        a=x;
        b=y;
    }
    public static void main(String[] args) {
        constructorWithArgument ob1 = new constructorWithArgument(100,200);
        System.out.println(ob1.a+","+ob1.b);
        constructorWithArgument ob2 = new constructorWithArgument(200,300);
        System.out.println(ob2.a+","+ob2.b);  
    }
}
