 public class String_method2 {
    public static void main(String[] args) {
        String s = "String";
        String s1 = "java";
        String s2 = "office word";
    char[] ch1=s.toCharArray();// tocharArray method
    for (int i = 0; i < ch1.length; i++) {
        System.out.println(ch1[i]);
    }
    System.out.println("-------------------");
    char[] ch2=s1.toCharArray();
    for (int i = 0; i < ch2.length; i++) {
        System.out.println(ch2[i]);
    }
    System.out.println("-------------------");
    char[] ch3=s2.toCharArray();
    for (int i = 0; i < ch3.length; i++) {
        System.out.println(ch3[i]);
    }
    }
}

