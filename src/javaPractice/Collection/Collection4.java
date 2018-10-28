package javaPractice.Collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;

public class Collection4 {

	static void printCollection(Collection<String> c) {
		String s = c.toString();
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Collection<String> c1 = new LinkedList<String>();
		Collection<String> c2 = new ArrayList<String>();
		
		c1.add("one");
		c1.add("two");
		
		c2.addAll(c1);	// c1 객체의 모든 내용을 c2(Collection 객체)에 넣는다. 
//		for(String s: c1) {
//			c2.add(s);
//		}
		c2.add("three");
		
		printCollection(c1);
		printCollection(c2);
	}
}
