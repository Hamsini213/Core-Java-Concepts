public class comapare_String_using_BuiltinMethod {
      public static void main(String[] args) {
        String s1="java";
        String s2="JAVA";
        String s3="java";
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contentEquals(s3));
    }
}

