package Interface3;

public class Edgedriver implements Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Edgedriver() {
		System.out.println("When the method call given the page url page will be open");
	}
	@Override
	public void geturl(String url) {
		System.out.println("When the method call given the page url edge will be open");
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void quite() {
		// TODO Auto-generated method stub
		
	}
}
