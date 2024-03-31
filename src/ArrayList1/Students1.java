package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class Students1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cclass s1=new Cclass("kukon", 37,"QA");
		Cclass s2=new Cclass("sahil", 30,"QA");
		Cclass s3=new Cclass("samit", 39,"QA");
		Cclass s4=new Cclass("shamir", 34,"QA");
		
		ArrayList<Cclass>ar=new ArrayList<Cclass>();	
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		/*for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).name);
			System.out.println(ar.get(i).age);
			System.out.println(ar.get(i).dept);
			System.out.println("********************");
			*/
		/*for(Cclass box:ar) {
			System.out.println(box.name);
			System.out.println(box.age);
			System.out.println(box.dept);
			*/
		/*for(Cclass student:ar) {
			System.out.println(student.name);
			System.out.println(student.age);
			System.out.println(student.dept);
			*/
        Iterator<Cclass> it=ar.iterator(); 
		
		while(it.hasNext()) {
			Cclass ob=it.next();
			System.out.println(ob.name);
			System.out.println(ob.age);
			System.out.println(ob.dept);
			System.out.println("******************");
			
		}
		
	}
	
}

