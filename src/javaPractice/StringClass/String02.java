package javaPractice.StringClass;

public class String02 {
	
	static void swap(String a, String b) {	// String은 객체(레퍼런스)이지만 다른 메소드가 실행될 때는 
												//그 레퍼런스조차 새로 생성되어, 같은 가리키게 된다.
		String temp = a;
		a = b;
		b = temp; 
	}
	
	public String02() {
		String s0 = "hello world";
		String s1 = s0.substring(0, 5);
		String s2 = s0.substring(6);
		String s3 = s1 + " " + s2;
    	String s4 = s0.toUpperCase();
    	System.out.printf("%s %s %s %s\n", s1, s2, s3, s4);
    	swap(s1, s2);
    	System.out.printf("%s %s\n", s1, s2);
	}
}
