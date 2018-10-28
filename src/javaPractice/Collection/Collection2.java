package javaPractice.Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collection2 {

	static void addData(Collection<String> c) {
		c.add("one");
		c.add("two");
		c.add("three");
	}
	
	static void printCollection(Collection<String> c) {
		for(String s : c) {
			System.out.printf("%s ", s);
		}System.out.println();
	}
	
	public static void main(String[] args) {
		//Collection 타입의 변수에 자식타입의 객체 대입 
		Collection<String> c1 = new LinkedList<String>();
		Collection<String> c2 = new ArrayList<String>();
		
		addData(c1);
		addData(c2);
		printCollection(c1);
		printCollection(c2);
	}
}
