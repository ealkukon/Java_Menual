package Array_generic;

import java.util.ArrayList;

public class Generic2 {

	public static void main(String[] args) {
		
		// in non generic data type array we can add any data type
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(50);
		ar.add(100);
		int ob=ar.size();
		
		for(int i=0;i<ar.size();i++) {
		    System.out.println(ar.get(i));
		}
	}

	}


