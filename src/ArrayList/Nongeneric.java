package ArrayList;

import java.util.ArrayList;

public class Nongeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add("kukon miah");
		ar.add('a');
		int ob=ar.size();		
		
		System.out.println(ob);
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		
		
	
	}

}
