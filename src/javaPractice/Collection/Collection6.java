package javaPractice.Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class Collection6 {

	static void printCollection(Collection<String> c) {
		String[] a = c.toArray(new String[0]);	// 길이가 0인 String배열로 리턴 
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		Collection<String> c1 = new LinkedList<String>();
		Collection<String> c2 = new ArrayList<String>();
		
		c1.add("one");
		c1.add("two");
		
		c2.addAll(c1);
		c2.add("three");
		c2.add("four");
		
		printCollection(c1);
		printCollection(c2);
		
		c2.retainAll(c1);	// c2에서 c1이 포함하는 항목이 아닌 것을 지워라!
		printCollection(c2);
	}
}
