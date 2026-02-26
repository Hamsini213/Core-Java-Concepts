public class toString_method2 {
    String name;
    String place;

    public toString_method2(String name,String place){
        this.name=name;
        this.place=place;
    }

    public String toString() {
        return this.name+" is from "+this.place;
    }
    
    public static void main(String[] args) {
        toString_method2 ts1= new toString_method2("anish","hassan");
        System.out.println(ts1.toString());
        System.out.println("-----------------------------");
        System.out.println(ts1);
    }
}