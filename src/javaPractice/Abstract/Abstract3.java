package javaPractice.Abstract;


abstract class Parent3{
	public static final double PI= 3.141592;
	
	public abstract void method1();
	public abstract void method2();
}

abstract class Child extends Parent3 {
	@Override
	public void method1() {
		System.out.println("Child method1");
	}
	
	//method2는 오버라이드 하지 않음 
	//abstract class일 경우, 부모의 모든 추상메소드를 오버라이드 할 필요는 없다 
}

class GrandChild extends Child{
	@Override
	public void method2() {
		 System.out.println("GrandChild method2()");
	}
}

public class Abstract3 {
	
	static void doSomething(Parent3 p) {
		p.method1();
		p.method2();
	}
	
	public static void main(String[] args) {
		//Child child = new Child();
			//추상클래스는 객체를 생성할 수 없다.
		
		GrandChild grand = new GrandChild();
			doSomething(grand);		//method1은 Child에서 오버라이딩 한 그대로 
									//method2는 GrandChild에서 오버라이딩 했음 
		
	}
}
