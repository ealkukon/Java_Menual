package Reverse;

public class Reverse {

	public static void main(String[] args) {
		
		//interview question how to reverse a string 
		//int numbers[]= {5,4,3,2,1};
		
		String name="sahil";
		int b = name.length();
	
		String rev="";
		
		for(int i=4;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
		
}
