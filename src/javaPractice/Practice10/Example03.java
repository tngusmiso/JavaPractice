package javaPractice.Practice10;

import java.util.Arrays;

public class Example03 {
	int a = 3, b = 4;

	class InnerClass {
		void swap() {
			int temp = a;
			a = 4;
			b = temp;
		}
	}
	
	void doSomethoing() {
		new InnerClass().swap();
		System.out.printf("%d %d\n", a, b);
	}

	public static void main(String[] args) {
		new Example03().doSomethoing();
	}
}