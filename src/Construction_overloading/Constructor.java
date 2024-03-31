package Construction_overloading;

public class Constructor {
	Constructor(int a, int b){
		System.out.println(a * b);
	}
	
	Constructor(int a, double b){
		System.out.println(a + b);
	}

	Constructor(int a, int b, int c){
		System.out.println(a - b - c );
	}
	
	
	public static void main(String[] args) {
		Constructor a=new Constructor(10,30);
		new Constructor(20,30);
		Constructor a1=new Constructor(40, 33.45);
		Constructor a2=new Constructor(60,20,30);

	

	}

}
