public class unautoboxing {
    
     public static void main(String[] args) {
        Integer num= new Integer(100);
        System.out.println(num);
        test(num);
    }
    public static void test(int a){
        System.out.println(a);
    }
}

