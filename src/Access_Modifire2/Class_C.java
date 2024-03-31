package Access_Modifire2;

import Access_Modifire1.Class_A;

public class Class_C {

	public static void main(String[] args) {
		// calling from different package
		Class_A.Orange();
		Class_A.Cat();

	}
	public static void Apple() {
		System.out.println("This is apple from class C");
	}

}
