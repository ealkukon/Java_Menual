package Method;

public class Method2 {

	public static void main(String[] args) {
		c();

	}
	public static void a() {
		System.out.println("Hi I am a");
	}
	public static void b() {
		a();
		System.out.println("Hi I am b");
	}
	public static void c() {
		b();
		System.out.println("Hi I am c");
		

}
}