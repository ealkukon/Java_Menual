package Setter_Getter;

public class Setter_Getter1 {
	
	private int profit;
	int less;
	String otherexpances;


	public static void main(String[] args) {
		

	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public void expense() {
		Setter_Getter1 ob=new Setter_Getter1();
		int expense=ob.profit-500;
		System.out.println(expense);	
	}
	public void tax() {
		Setter_Getter1 ob=new Setter_Getter1();
		int tax=ob.profit-2000;
	}

}
