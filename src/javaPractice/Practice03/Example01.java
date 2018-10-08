package javaPractice.Practice03;

public class Example01 {
	static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
    public static void main(String[] args) {
        String s = "hello world";
        s = reverse(s);
        System.out.println(s);
	}
}
