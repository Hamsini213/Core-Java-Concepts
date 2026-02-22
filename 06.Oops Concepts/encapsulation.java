//!3. Encapsulation
package OopsConcepts;

public class encapsulation 
{

    private String name;

    // Getter method used to get the data
    public String getName() 
    { 
        return name; 
    }

    // Setter method is used to set or modify the data
    public void setName(String name) 
    {
        this.name = name;
    }
}

 class encapsulation1 
 {
    public static void main(String[] args)
    {
        encapsulation p = new encapsulation();
        p.setName("ABCD");
        System.out.println("ABCD " + p.getName());
    }
}
