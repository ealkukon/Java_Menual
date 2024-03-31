package Array_generic;

import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(50);
		ar.add(100);
		int ob=ar.size();
		
		for(int i=0;i<=2;i++) {
		    System.out.println(ar.get(i));
		}
	}

}
