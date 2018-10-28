package javaPractice.Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Stack;

public class Collection7 {

	static void printCollection(String s, Collection<String> c) {
		String[] a = c.toArray(new String[0]);	// 길이가 0인 String배열로 리턴 
		Arrays.sort(a);
		System.out.printf("%s: %s\n", s, Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		Collection<String> c1 = new Stack<String>();
		Collection<String> c2 = new LinkedList<String>();
		Collection<String> c3 = new ArrayList<String>();
		
		for(int i = 0; i<20; i +=2) {
			String s = String.format("%02d", i);
			c1.add(s);
		}
		printCollection("c1(2의 배수)",c1);
		
		for(int i = 0; i<20; i +=3) {
			String s = String.format("%02d", i);
			c2.add(s);
		}
		printCollection("c2(3의 배수)",c1);
		
		c3.clear();	// 비우기 
		c3.addAll(c1);	// c3에 c1 채우기 (2의배수)
		c3.retainAll(c2); // c3에서 c2만 남기고 비우기 (3의배수)
		printCollection("c1,c2 교집합 / 2의 배수이자 3의 배수", c3);
		
		c3.clear();	// 비우기 
		c3.addAll(c1);	// c3에 c1 채우기 (2의배수)
		c3.removeAll(c2); // c3에서 c2 비우기 (3의배수)
		printCollection("c1,c2 차집합 / 3의 배수가 아닌 2의 배수", c3); 

		c3.clear();	// 비우기 
		c3.addAll(c2);	// c3에 c2 채우기 (3의배수)
		c3.removeAll(c1); // c3에서 c1 비우기 (2의배수)
		printCollection("c2,c1 차집합 / 2의 배수가 아닌 3의 배수", c3);

		c3.clear();	// 비우기 
		c3.addAll(c1);	// c3에 c1 채우기 (2의배수)
		c3.removeAll(c2); // c3에서 c2만 남기고 비우기 (3의배수)
		c3.addAll(c2); // c3에서 c2 채우기 (3의배수)
		printCollection("c1,c2 합집합 / 2의 배수와 3의 배수", c3);
	}
}