package Method;

public class Method1 {

	public static void main(String[] args) {
		
		maria();
		sufi(2000,200);
		alam();

	}
	// static method without argue//non return
	public static void maria() {
		int sal=1000;
		int com=100;
		int total=sal+com;
		System.out.println(total);
    }
	// static method with argue//non return
	public static void sufi(int sal,int com) {
		int total=sal+com;
		System.out.println(total);
		
    }
	// static method with argue//non return
	public static int alam() {
		int sal=3000;
		int com=300;
		int total=sal=com;
		System.out.println(total);
		return 5;
		
	}
	}
