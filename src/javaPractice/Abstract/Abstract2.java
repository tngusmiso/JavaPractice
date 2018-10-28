package javaPractice.Abstract;

abstract class Parent2{
	public static final double PI = 3.141592;
	
	public abstract void method1();
	public abstract void method2();
}

class ChildOne2 extends Parent2{
	
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("ChildOne method2()");
		
	}
}

class ChildTwo2 extends Parent2{
	
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("ChildTwo method2()");
		
	}
}

public class Abstract2 {
	
	static void doSomething(Parent2 p) {
		p.method1();
		p.method2();
	}
	
	public static void main(String[] args) {
		ChildOne2 child1 = new ChildOne2();
		ChildTwo2 child2 = new ChildTwo2();
		doSomething(child1);
		doSomething(child2);
		
	}

}
