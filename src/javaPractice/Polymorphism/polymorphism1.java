package javaPractice.Polymorphism;


class Parent{
	public void method1() {
		System.out.println("Parent method1()");
	}
}

class ChildOne extends Parent{
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
}

class ChildTwo extends Parent{
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
}

class ChildThree extends Parent{
	//오버라이드 안
}

public class polymorphism1 {
	public static void main(String[] args) {
		Parent p;
		ChildOne child1 = new ChildOne();
		ChildTwo child2 = new ChildTwo();
		ChildThree child3 = new ChildThree();
		
		child1.method1();	//child1 타입에서 child1의 메소드 호출은 당연함! 
							//다형성 아님 		
		p = child1;
		p.method1();	// 다형성 호출 
		
		p = child2;
		p.method1();	// 다형성 호출 
		
		p = child3;
		p.method1();	// 다형성 호출 
		
	}

}
