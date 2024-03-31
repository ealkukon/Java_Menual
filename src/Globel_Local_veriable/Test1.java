package Globel_Local_veriable;

public class Test1 {
	
   int version =60; //Gloval

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ob=new Test1();
		ob.cat1();

	}
	public void cat1() {
		Test1 ob1 = new Test1();
		ob1.version=200;
		System.out.println("ob1 value"+ob1.version); //40
		Test1 ob2=new Test1();
		System.out.println(ob2.version); //20
	}

}
