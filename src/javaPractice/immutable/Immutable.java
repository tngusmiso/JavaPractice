package javaPractice.immutable;

public class Immutable {
	
	public Immutable() {
		int i = 3;
		sub1(i);
		System.out.println(i); // 변수 i에 3이 대입된 이후로 새 값이 대입된 것이 없다.
		
		String s = "hello";
		sub2(s);
		System.out.println(s); // 변수 s에 "hello" 문자열이 대입된 이후 새 문자열이 대입되지 않았다.

	}
	
	static void sub1(int a) {
		a = a + 1;
		System.out.println(a);
	}
	static void sub2(String a) {
		a = a.toUpperCase();
		System.out.println(a);
	}
}
