package javaPractice.Abstract;


abstract class Parent{
	public void method1() {
		System.out.println("parent method1()");
	}
	
	public abstract void method2();
}

class ChildOne extends Parent {
	
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("ChildOne method2()");
	}
}

class ChildTwo extends Parent{
	
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("ChildTwo method2()");
	}
}

class ChildThree extends Parent{
	
	//method1은 오버라이드 하지 않음 (Parent의 method1을 그대로 사용)
	
	@Override
	public void method2() {
		System.out.println("ChildThree method2()");
	}
}

public class Abstract1 {
	static void doSomething(Parent p) {
		p.method1();
		p.method2();
	}
	
	public static void main(String[] args) {
		ChildOne child1 = new ChildOne();
		ChildTwo child2 = new ChildTwo();
		ChildThree child3 = new ChildThree();
		
		doSomething(child1);
		doSomething(child2);
		doSomething(child3);
	}
}
