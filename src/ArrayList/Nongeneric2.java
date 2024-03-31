package ArrayList;

import java.util.ArrayList;

public class Nongeneric2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add("kukon");
		ar.add('a');
		int ob=ar.size();	
		
		// 0 to 2
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
