package java2.finalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exam15 {
	public static void solution(List<Integer> list) {
		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i <10)
				iterator.add(i + 10);
		}
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.addAll(Arrays.asList(2, 3, 1, 22, 5, 8));
		list2.addAll(Arrays.asList(7, 33, 9, 4, 2, 6));
		solution(list1);
		solution(list2);
		System.out.println(list1.toString());
		System.out.println(list2.toString());
	}
}