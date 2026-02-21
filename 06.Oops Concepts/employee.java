//! Real time example of Inheritance
package OopsConcepts;
//*******************PARENT CLASS******************************** */
public class employee
{
    String ename;
    int eid;
    double Salary;
    public employee(String ename , int eid, double Salary)
    {
        this.ename=ename;
        this.eid=eid;
        this.Salary=Salary;
    }
}
//*******************CHILD CLASS****************************** */
 class developer extends employee
{
    String technology;
public developer(String ename , int eid, double Salary,String technology)
{
super(ename,eid,Salary);
this.technology=technology;
}
public static void main(String[] args)
  {
    developer d1 = new developer("ABC",101,200000,"Java");
   System.out.println(d1.ename+","+d1.eid+","+d1.Salary+","+d1.technology);
   } 
}
