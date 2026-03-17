public class CharArray_to_String {
    public static void main(String[] args) {
        char[] ch ={'j','a','v','a'};
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        System.out.println("**********************************");
        String s = new String(ch);
        System.out.println(s);
    }
}

