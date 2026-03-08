public class garbagecollection2 {
    
	int a = 100;
	int b = 200;
	public static void main(String[] args) {
		garbagecollection2 g2 = new garbagecollection2();
		System.out.println(g2);
		
		g2 = null;
		System.out.println(g2);
	}
}
//Output:demo.garbagecollection2@65b3120anull

