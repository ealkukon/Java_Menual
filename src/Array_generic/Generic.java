package Array_generic;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(50);
		ar.add(100);
		int ob=ar.size();
		
		System.out.println(ob);
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
	}

}
