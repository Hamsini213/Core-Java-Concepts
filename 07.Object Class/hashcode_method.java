
    public class hashcode_method {
    String name;
    int mark;
    int uid;

    public hashcode_method(String name,int mark,int uid){
        this.name=name;
        this.mark=mark;
        this.uid=uid;
    }
    public static void main(String[] args) {
        hashcode_method hs1= new hashcode_method("harsha", 85, 108);
        hashcode_method hs2= new hashcode_method("hamsini", 95, 109);
        hashcode_method hs3= new hashcode_method("bharath", 87, 110);
        System.out.println(hs1.hashCode());
        System.out.println(hs2.hashCode());
        System.out.println(hs3.hashCode());   
    }
}
