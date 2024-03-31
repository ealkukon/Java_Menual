package Polymorphism;

public class Albummovie {
	public void movie() {
		System.out.println("movie");
	}
	}
class English extends Albummovie{
	public void movie() {
		System.out.println("Enlish movie");
	}
}
class Hindi extends Albummovie{
	public void movie() {
		System.out.println("Hindi movie");
	}
}
class Tamil extends Albummovie{
	public void movie() {
		System.out.println("Tamil movie");
	}
}


