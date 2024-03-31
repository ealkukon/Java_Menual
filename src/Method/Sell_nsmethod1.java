package Method;

public class Sell_nsmethod1 {

	public static void main(String[] args) {
		// How to create an object?
		//Create from class name public class Sell_nsmethod {
		
		Sell_nsmethod object1=new Sell_nsmethod();
			
				int a=object1.kukon();
				System.out.println(a);
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
