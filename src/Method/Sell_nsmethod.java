package Method;

public class Sell_nsmethod {

	public static void main(String[] args) {
		// How to create an object?
		//Create from class name public class Sell_nsmethod {
		
		Sell_nsmethod object1=new Sell_nsmethod();
		object1.maria();
		
		Sell_nsmethod object2=new Sell_nsmethod();
		object2.sufi(1000,300);
		
		int a=object1.kukon();
		System.out.println(a);

	}
	//non static method with argue//non return type
	public void maria() {
		int sal=1000;
		int com=100;
		int total=sal+com;
		System.out.println(total);
	}
	//non static method with argue//non return type
	public void sufi(int sal,int com) {
		int total=sal+com;
		System.out.println(total);
	}
	//non static method with argue//non return type
	public int kukon() {
		int sal=2000;
		int com=300;
		int total=sal+com;
		System.out.println(total);
		return com;
	}

}
