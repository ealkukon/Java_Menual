package Row_colmn;

public class Dim_array1 {

	public static void main(String[] args) {
		//Dim array for loop row & column
	Object login[][]= {{"abc@gmail.com",1234},{"adf@gmail.com",1235,'c'}};
	//Row
	System.out.println(login.length);
	//Column
	System.out.println(login[0].length);
	
	for(int row=0;row<login.length;row++) {
		for(int colm=0;colm<login[0].length;colm++) {
			System.out.println(login[row][colm]);
		}
	}

	}

}
