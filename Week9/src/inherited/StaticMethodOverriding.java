package inherited;

class A {
	public static void m1() {
		System.out.println("I'm A");
	}
}

class B extends A {
	public static void m1() {
		System.out.println("I'm B");
	}
}

public class StaticMethodOverriding {

	public static void main(String[] args) {
		A aInst = new B();
		A.m1();
		aInst.m1();
		
		System.out.println();
		
		B bInst = new B();
		bInst.m1();
		((A)bInst).m1();
	}
}
