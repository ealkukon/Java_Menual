package Setter_Getter;

public class Setter_Getter {
	
	private int profit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void expense() {
		Setter_Getter ob=new Setter_Getter();
		int expense=ob.profit-500;
		System.out.println(expense);	
	}
	public void tax() {
		Setter_Getter ob=new Setter_Getter();
		int tax=ob.profit-2000;
    }
	public void set (int profit) {
		this.profit=profit;
	}
	public int get() {
		return this.profit;
	}
}
