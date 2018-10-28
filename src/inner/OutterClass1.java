package inner;

public class OutterClass1 {
	int a;
	
	class InnerClass{
		int b;
		
		void method2() {
			b=5;
			this.b = 6;
			
			//InnerClass에서 OutterClass의 멤버변수에 접근할 수 있다.
			a=7;
			OutterClass1.this.a = 8;
			
			//InnerClass에서 OutterClass의 메소드를 호출할 수 있다. 
			instanceMethod();
			OutterClass1.this.instanceMethod();
			
			//this는 InnerClass를 가리키는데, instanceMethod()는 OutterClass의 메소드이다.
			//this.instanceMethod()			컴파일 에러 
				
			main(null);
		}
	}
	
	public void instanceMethod() {
		InnerClass obj = new InnerClass();
		a = 1;
		this.a = 2;
		obj.method2();
	}
	
	public static void main(String[] args) {
		OutterClass1 o = new OutterClass1();
		o.instanceMethod();
		
		// main메소드는 static이라 this를 사용할 수 없다.
		// InnerClass 객체 생성 불가
		// a에 값 대입 불가 
		// this.a 사용불가 
	}
}
