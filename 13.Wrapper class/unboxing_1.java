public class unboxing_1 {
    
      public static void main(String[] args) {
        Double d = new Double(102.f);
        double D=d.doubleValue();

        Boolean b = new Boolean("true");
        boolean B=b.booleanValue();
        
        System.out.println(d);
        System.out.println(D);
        System.out.println("-------------------");
        System.out.println(b);
        System.out.println(B);
    }
}

