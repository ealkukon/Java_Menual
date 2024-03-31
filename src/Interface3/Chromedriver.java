package Interface3;

public class Chromedriver implements Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Chromedriver() {
		System.out.println("When the method call given the page url page will be open");
	}
	@Override
	public void geturl(String url) {
		System.out.println("When the method call given the page url page will be open");
		
	}

	@Override
	public void close() {
		System.out.println("When the method call the windows will be close");
		
	}

	@Override
	public void quite() {
		System.out.println("When the method call the all windos will be close");
		
	}

}
