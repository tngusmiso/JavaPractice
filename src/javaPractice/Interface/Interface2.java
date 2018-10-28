package javaPractice.Interface;

interface A{
	//public static 
	void method1();
}

interface B extends A {	//인터페이스끼리도 상속 가능 
	//public static
	void method2();
}

class S1 implements A{
	@Override // 반드시 method1 구현 
	public void method1() {
		System.out.println("S1 method1()");
	}
}

class S2 implements B{
	@Override // 부모 인터페이스인 A의 method1() 반드시 구현 
	public void method1() {
		System.out.println("S2 method1()");
	}
	
	@Override // 자식 인터페이스인 B의 method2() 반드시 구현 
	public void method2() {
		System.out.println("S2 method2()");
	}
}

public class Interface2 {

	static void print1(A obj) {
		obj.method1();
	}
	
	static void print2(B obj) {
		obj.method1();
		obj.method2();
	}
	
	public static void main(String[] args) {
		S1 s1 = new S1();
		S2 s2 = new S2();
		print1(s1);	// 인터페이스 A를 구현한 클래스 S1도 A에 대입 가능 
		print1(s2);	// 인터페이스 B를 구현한 클래스 S2도 A에 대입 가능 
		print2(s2); // 인터페이스 B를 구현한 클래스 S2도 B에 대입 가능 
	}
}
