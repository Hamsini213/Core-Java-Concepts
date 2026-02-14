//! 1.While Loop
// Write a number in palindrom
package looping;

public class whileloop {
    public static void main(String[] args) {
        int num =12321 ;
        int temp = num;
        int palindrom =0;
        int Lastdigit = 0;
        while (temp!=0) {
            Lastdigit=temp%10;
            palindrom = palindrom*10+Lastdigit;
            temp = temp/10; 
        }
        if (num==palindrom) {
            System.out.println(num+"is a palindrom");
        } else {
            System.out.println(num+"is not a palindrom");
        }
    }
}
