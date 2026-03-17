public class String_method7 {
    public static void main(String[] args) {
        String s = " java is easy language   ";
        String s1 = "      sql is query language";
        String s2 = " JDBC IS A API   ";
        String t1=s.trim();
        String t2=s1.trim();
        String t3=s2.trim();

        System.out.println(t1);// trim
        System.out.println(t2);
        System.out.println(t3);
        System.out.println("-----------------------");
        System.out.println(t1.replace("easy","difficult"));// replace
        System.out.println(t2.replace("query","Query"));
        System.out.println(t3.replace("A","THE"));
    }
}

