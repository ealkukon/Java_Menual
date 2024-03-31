package Interface3;

public class Test {
	Webdriver driver;

	public static void main(String[] args) {
		Test ob=new Test();
		ob.chrome();
		ob.edge();
	
		
	}
	public void chrome() {
		driver=new Chromedriver();
		
		driver.geturl("www.amazon.com");
		driver.close();
		driver.quite();
	}
	public void edge() {
		driver=new Edgedriver();
		driver.geturl("www.google.com");
		
		
	}

}
