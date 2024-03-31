package Row_colmn;

public class Dim_for_each_loop {

	public static void main(String[] args) {
		
		//Dim array for each loop row & column
		
		Object login[][]= {{"abc@gmail.com",1234},{"adf@gmail.com",1235,'c'}};
		//Row
		System.out.println(login.length);
		//Column
		System.out.println(login[0].length);
		
		for(Object al[]:login) {
			for(Object box :al)
				System.out.println(box);
		}
		
		

	}

}
