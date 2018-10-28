package javaPractice.Collection;

//import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;

public class Collection3 {
	static void addData(Collection<String> c) {
		c.add("one");
		c.add("two");
		c.add("three");
	}
	
	static void printCollection(Collection<String> c) {
		// Object[] a = c.toArray();	// 배열로 바꾸기 
		// String s = Arrays.toString(a); // 문자열로 바꾸기 
		
		String s = c.toString();	// Collection 자체에도 문자열로 바꾸는 함수가 있다.  
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Collection<String> c1= new LinkedList<String>();
		Collection<String> c2 = new ArrayList<String>();
		
		addData(c1);
		addData(c2);
		printCollection(c1);
		printCollection(c2);
	}
}
