package methods;

public class constructorOverloading {
    public constructorOverloading(){
        System.out.println("from test-1");
    }
    public constructorOverloading(int a){
        System.out.println("from test-2");
    }
    public constructorOverloading(int a, int b){
        System.out.println("from test-3");
    }
    public static void main(String[] args) {
       constructorOverloading ob1=new constructorOverloading();
       constructorOverloading ob2=new constructorOverloading(100);
       constructorOverloading ob1=new constructorOverloading(100,200);
    }
    
    }
