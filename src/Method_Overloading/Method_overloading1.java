package Method_Overloading;

public class Method_overloading1 {

	public static void main(String[] args) {
     
		Method_overloading1 ob=new Method_overloading1();
		ob.Method_overloading("kukon");
		ob.Method_overloading(100);
		ob.Method_overloading(30, "sahil");

	}
	public void Method_overloading(int x) {
		System.out.println(x);
	}
	public void Method_overloading(String y) {
		System.out.println(y);
	}
	public void Method_overloading(int x,String y) {
		System.out.println(y+x);
}
}
