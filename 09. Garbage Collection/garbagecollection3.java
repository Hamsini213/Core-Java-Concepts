public class garbagecollection3 {
    int a = 100;
	int b = 200;
	public void finalize() throws Throwable
	{
		System.out.println(1);
	}
	public static void main(String[] args) {
		garbagecollection3 g1 = new garbagecollection3();
		System.out.println(g1);
		g1 = null;
		
		garbagecollection3 g2 = new garbagecollection3();
		System.out.println(g2);
		 g2 = new garbagecollection3();
		 System.out.println(g2);
	}
}
//Output:demo.garbagecollection3@65b3120a
    //   demo.garbagecollection3@6f539caf
    //   demo.garbagecollection3@79fc0f2f
