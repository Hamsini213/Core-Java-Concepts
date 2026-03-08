//! 2.DownCasting
public class DownCasting {
	int x=100;
	public void test1() {
		System.out.println("test1");
	}
    
}
//-----------------------------------------------------------------
class InnerDownCasting extends DownCasting {
	int y = 200;
	public void test2() {
		System.out.println("test2");	
	}
	public static void main(String[] args) {
		DownCasting D1 = new InnerDownCasting();//Upcasting
		System.out.println(D1.x);
		D1.test1();
		InnerDownCasting D2 = (InnerDownCasting)D1;// downcasting
		System.err.println(D2.x);
		System.out.println(D2.y);
		D2.test1();
		D2.test2();
	}
}
