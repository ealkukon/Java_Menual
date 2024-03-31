package Method;

public class Sell_nsmethod2 {

	public static void main(String[] args) {
		
		Sell_nsmethod2 object1=new Sell_nsmethod2();
        int d=object1.jack(4000,400);
        System.out.println(d);
	}
		//non static return type method with argue
		public int jack(int sal, int com) {
			int total=sal+com;
			System.out.println(total);
			return total;

	}

}
