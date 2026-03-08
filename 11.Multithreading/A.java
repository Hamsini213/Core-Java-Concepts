package MultiThreading;

public class A extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread");
        }
    }
public static void main(String[] args) {
    A ob1 = new A();
    ob1.start();
    for (int i = 0; i < 5; i++) {
        System.out.println("mainmethod");
    }
    
}
    
}
