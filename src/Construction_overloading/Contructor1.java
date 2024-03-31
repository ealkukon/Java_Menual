package Construction_overloading;

public class Contructor1 {
	
	public Contructor1(int x) {
		System.out.println("Salary"+x);
	}
	public Contructor1(int y,int x) {
		
	}
	public Contructor1(String y) {
		System.out.println(y);
	}
	public static void main(String[] args) {
		new Contructor1("kukon");
		new Contructor1(5000);

	}
	
	
	}

