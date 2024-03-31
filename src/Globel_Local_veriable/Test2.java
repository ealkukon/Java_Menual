package Globel_Local_veriable;

public class Test2 {

       static int version =20; //Gloval

	   public static void main(String[] args) {
	// TODO Auto-generated method stub
	   Test2 ob=new Test2();
	   ob.cat1();

	   }
	   public void cat1() {
	   Test2 ob1 = new Test2();
	   ob1.version=200;
	   System.out.println("ob1 value"+ob1.version); //200
	   
	   Test2 ob2=new Test2();
	   ob2.version=100;
	   System.out.println(ob2.version); //100
	   
	   Test2 ob3=new Test2();
	   ob3.version=50;
	   System.out.println(ob3.version); //50

	}

}
