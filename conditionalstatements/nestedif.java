//! 4. Nested if
//person is eligible for voting
public class nestedif {
    public static void main(String[] args) {
        int age = 25;
        boolean eid = false;
        if (age>18) {
            System.out.println("eligible to vote");
        }
        else if (age<18){
            System.out.println("not eligible");
        }
   else{
       System.out.println("NE");
   } 
}
}
