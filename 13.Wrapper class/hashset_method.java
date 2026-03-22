import java.util.HashSet;

public class hashset_method {
    public static void main(String[] args) {
        HashSet h=new HashSet<>();
         h.add("java");
         h.add("python");// add()
         h.add("jdbc");
         System.out.println(h);
        System.out.println("-----------------------------");
        HashSet h1=new HashSet<>();
        h1.addAll(h);       //addAll()
        System.out.println(h1);
        System.out.println("-----------------------------");
        h1.remove("jdbc");// remove()
        System.out.println(h1);
        System.out.println("-----------------------------");
        Boolean h2=h1.contains("jdbc"); //contains()
        System.out.println(h2);



         
    }
}