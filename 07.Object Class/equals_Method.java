public class equals_Method {
    int a =100;
    int b =200;
    public static void main(String[] args) {
        equals_Method eq1= new equals_Method();
        equals_Method eq2= new equals_Method();
        equals_Method eq3=eq1;

        System.out.println(eq1.equals(eq2));
        System.out.println(eq1.equals(eq3));
    }
}
//************************************************************************************ */
 class equals_Method2 {
    int cc;
    int mil;

    public equals_Method2(int cc,int mil){
        this.cc=cc;
        this.mil=mil;
    }
    public boolean equals(Object obj){
        equals_Method2 temp = (equals_Method2) obj;

        if(this.cc == temp.cc && this.mil== temp.mil){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        equals_Method2 RE = new equals_Method2(55, 40);
        equals_Method2 yezdi = new equals_Method2(65, 40);

        System.out.println(RE.equals(yezdi));
    }
}
