package practice;

class A {
	  int i = 10;
	
	public static void a() {
		System.out.println("Parent");
	}
}

class B extends A{
	 int i = 20;
	
	public static void a() {
		System.out.println("Child");
	}
}
public class Example {

	public static void main(String[] args) {
		
		A a = new B();
		System.out.println(a.i);
		a.a();

	}

}
