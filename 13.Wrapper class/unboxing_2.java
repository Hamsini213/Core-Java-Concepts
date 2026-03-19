public class unboxing_2 {

    public static void main(String[] args) {
        Float f = new Float(102.f);
        float f1=f.floatValue();

        Integer i = new Integer(100);
        int i1=i.intValue();
        
        System.out.println(f);
        System.out.println(f1);
        System.out.println("-------------------");
        System.out.println(i);
        System.out.println(i1);
       }
}

