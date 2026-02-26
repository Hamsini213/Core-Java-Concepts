public class toString_method3 {
 
    String student_name;
    String branch;
    int uid;

    public toString_method3(String student_name,String branch,int uid){
        this.student_name=student_name;
        this.branch=branch;
        this.uid=uid;
    }

    public String toString() {
        return this.student_name+" is from "+this.branch+" and his uid is "+this.uid;
    }
    
    public static void main(String[] args) {
        toString_method3 ts1= new toString_method3("anish","Aiml",002);
        toString_method3 ts2= new toString_method3("anish","Aiml",002);

        System.out.println(ts1.toString());
        System.out.println(ts2.toString());
        System.out.println("-----------------------------");
        System.out.println(ts1);
        System.out.println(ts2);

    }
}