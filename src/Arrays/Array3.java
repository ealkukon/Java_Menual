package Arrays;

public class Array3 {

	public static void main(String[] args) {
            // Array for loop
			int roll[]=new int[4];
			roll[0]=5;
			roll[1]=20;
			roll[2]=10;
			roll[3]=25;
			int totalbox=roll.length;
			System.out.println(totalbox);
			//0 to 3 index
			for(int i=0;i<=roll.length;i++) {
				System.out.println(roll[i]);
			}
	}

}
