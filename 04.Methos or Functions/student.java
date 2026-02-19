//! Real World example of this keyword
package methods;

public class student 
{
    String sname;
    int regno;
    float percentage;
// ----------------constructor--------------------------------------
public student( String sname, int regno , float percentage)
{
    this.sname=sname;
    this.regno=regno;
    this.percentage=percentage;
}
//-----------------Main Method---------------------------------------
public static void main(String[] args)
 {
    student s1 = new student("Abc",101,68);
    student s2 = new student("def",102,95);
    student s3 = new student("xyz",103,80);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
}     
}
