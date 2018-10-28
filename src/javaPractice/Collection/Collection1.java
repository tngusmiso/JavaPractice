package javaPractice.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();	// 부모타입의 변수에 자식타입의 객체 대입 가능 
		
		// 다형성 함수 호출 
		c.add("one");
		c.add("two");
		c.add("three");
		
		// for문으로 탐색가능 
		for(String s : c) {
			System.out.printf("%s ",s);
		}
	}
}
