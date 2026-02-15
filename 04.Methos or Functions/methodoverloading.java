//! Method Overloading
package methods;

public class methodoverloading {
    public static int add(int a,int b,int c) {
        int sum = a+b+c;
        return sum ;
    }
    public static double add(int a,float b,double c) {
        double sum = a+b+c;
        return sum;  
    }
    public static String add (String a, char b, boolean c) {
        String sum = a+b+c;
        return sum; 
    }
    public static void main(String[] args) {
        System.out.println(add("Hamsini", '@', true));
        System.out.println(add(10,20,30));
        System.out.println(add(10,25.25f,250000 ));
    }
}
