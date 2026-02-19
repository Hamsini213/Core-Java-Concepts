//! This Call Statement Example
package methods;

public class thiscallstatementexample {
    int a,b;
    public thiscallstatementexample(int x){
        System.out.println("From constructor 1");
        this.a=x;
    }
    public thiscallstatementexample(int y,int z){
        this(y);//THIS CALL STATEMENT
        System.out.println("From constructor 2");
        this.b=z;// THIS STATEMENT
    }
    public static void main(String[] args) {
        thiscallstatementexample ob1 = new thiscallstatementexample(100,200);
        System.out.println(ob1.a+","+ob1.b);
        
    }
}
