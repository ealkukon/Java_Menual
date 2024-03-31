package Global_Veriable;

public class Test1 {
	
	private int g;

	public static void main(String[] args) {
		
	}
	public void cat() {
		int g=10;//local
		this.g=g;// global 
	}
	public void cat(int g) {
		this.g=g;//
	}
	public int check() {
		return g;
		
	}

}
