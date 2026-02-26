
    public class hashcode_method2 {

    int mark;
    int uid;

    public hashcode_method2(int mark,int uid){
        this.mark=mark;
        this.uid=uid;
    }
    public static void main(String[] args) {
        hashcode_method2 hs1= new hashcode_method2( 85, 108);
        hashcode_method2 hs2= new hashcode_method2( 95, 109);
        hashcode_method2 hs3= new hashcode_method2( 87, 110);
        System.out.println(hs1.hashCode());
        System.out.println(hs2.hashCode());
        System.out.println(hs3.hashCode());   
    }
    }
