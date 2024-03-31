package Row_colmn;

public class Dim_array_for_loop1 {

	public static void main(String[] args) {
		int x[][]=new int [2][3];
		x[0][0]=5000;
		x[0][1]=5000;
		
		for(int row=0;row<x.length;row++) {
			for(int column=0;column<x[1].length;column++) {
				System.out.println(x[row][column]);
			}
			
		}

	}

}
