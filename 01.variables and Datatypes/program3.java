//! second greatest number using condtional operator
public class program3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int res = a>b?(a>c?(b>c?b:c):b):(b>c?(b>a?a:b):a);
        System.out.println(res);
        }
}
