 import java.util.SortedSet;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(100);
        s.add(700);
        s.add(500);
        s.add(200);
        s.add(300);
        s.add(400);
        System.out.println(s);
        System.out.println("****************************");
        TreeSet<Integer> s1 = new TreeSet<Integer>(s);
        System.out.println(s1);



    }
}

