public class clone_method implements Cloneable{
     String name;
    int mark;
    int uid;

    public clone_method(String name,int mark,int uid){
        this.name=name;
        this.mark=mark;
        this.uid=uid;
    }
     public String toString() {
        return this.name+","+this.mark+","+this.uid;
    }
    public static void main(String[] args) {
        clone_method cs = new clone_method("anish", 100, 69);

        clone_method [] c= new clone_method[5];
        for (int i = 0; i < c.length; i++) {
            try {
                c[i]=(clone_method)cs.clone();
            } catch (CloneNotSupportedException e) {
            }
        
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
