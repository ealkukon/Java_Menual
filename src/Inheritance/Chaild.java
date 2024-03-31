package Inheritance;

public class Chaild extends Father{

	public static void main(String[] args) {
		Chaild ob=new Chaild();
		ob.bikecycle();
		ob.car();
		ob.house();
	
	}
	public void bikecycle() {
		System.out.println("Bikecycle from child");
	}

}
