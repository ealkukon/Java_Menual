package Method_Overriding;

public class B1 extends A1{

	public static void main(String[] args) {
		// create a object class/and get all access from father B1
		A1 ob=new B1();
		ob.red();
		ob.blue();
	}
	public void red() {
		System.out.println("this red from B1");
	}
	public void green() {
		System.out.println("this green from B1");
	}
	public void red2() {
		System.out.println("this red2 from B1");
		
	}


}
