package Reverse;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sahil";
		int b = name.length();
	
		String rev="";
		
		for(int i=4;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);


	}

}
