public class Association
{
    //!---------------------------ENGINE------------------------
    int cc;
    float milage;
    public Association(int cc,float milage) 
    {
        this.cc=cc;
        this.milage=milage; 
    }
    public void displayCarinfo()
    {
        System.out.println(this.cc+","+this.milage);
    }

public class InnerAssociation 
{
    //!-----------------------------CAR-------------------------------
    String model;
    double price;
    String color;
    Association X; //-------Engine------  
    
    public  InnerAssociation( String model,String color , double price,Association X)
    {
        this.model=model;
        this.price=price;
        this.color=color;
        this.X=X;
    }
    public void displayCarinfo()
    {
        System.out.println(this.model+this.price);
    }
}
public static void main(String[] args) 
{
     Association A = new Association(4000,6);
     Association A1 = new Association("BMW",100000,"black",A);
     Association A2 = new Association("BENZ",200000,"grey",A);
     Association A3 = new Association("AUDI",1000000,"pink",A);
     
     Association[]ob={A1,A2,A3};
     for (int i = 0; i< 3; i++) {
        ob[i].displayCarinfo();
        ob[i].X.displayCarinfo();
        
     }
     
     
    
}

}
