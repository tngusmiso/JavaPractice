package java2.finalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exam02 {
	public static void solution(List<String> list) {
		// 구현하라.
		List<String> list2 = new ArrayList<>();
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			String s = iterator.next();
			if(list2.contains(s))
				iterator.remove();
			else list2.add(s);
			}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("d", "a", "b", "a", "c", "d", "e", "f", "e"));
		solution(list);
		System.out.println(list);
	}
}
