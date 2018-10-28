package javaPractice.Polymorphism;
//
//class Parent{
//	public void method1() {
//		System.out.println("Parent method1()");
//	}
//}
//
//class ChildOne extends Parent{
//	@Override
//	public void method1() {
//		System.out.println("ChildOne method1()");
//	}
//}
//
//class ChildTwo extends Parent{
//	@Override
//	public void method1() {
//		System.out.println("ChildTwo method1()");
//	}
//}
//
//class ChildThree extends Parent{
//	//오버라이드 안함 
//}

public class polymorphism2 {
	
	static void doSomething(Parent parent) {
		parent.method1();
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
