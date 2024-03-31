package Access_Modifire1;

public class Class_B {

	public static void main(String[] args) {
		// Calling from class A
		Class_A ob=new Class_A();
		ob.Orange();
		ob.Cat();
	}
	public static void Banana() {
		System.out.println("This is Banana from class B");
	}
}
