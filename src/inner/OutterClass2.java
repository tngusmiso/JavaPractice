package inner;

public class OutterClass2 {

	int a = 2;

	static class InnerClass {
		int b;

		void method2() {

			//* InnerClass 변수 접근 가능
			b = 5;
			this.b = 6;

			//* static 이너클래스에서는 아우터클래스의 this를 사용할 수 없다.
//			a = 7;
//			OutterClass2.this.a = 8;
//			instanceMethod();
//			this.instanceMethod();
//			OutterClass2.this.instanceMethod2();

			//
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
		InnerClass obj = new InnerClass();
		obj.method2();
//		a = 3;
//		this.a = 4;
	}
}
