package y2021;

class A{}

class B extends A{}


public class OverloadingConcepts {
	
	void method(A a) {
		System.out.println("A");
	}
	void method(B b) {
		System.out.println("B");
	}
	
	
	public static void main(String[] args) {
		
		OverloadingConcepts obj= new OverloadingConcepts();
		A a= new A();
		B b = new B();
		A aa = new B();
		obj.method(a);
		obj.method(b);
		obj.method(aa);

	}

}
