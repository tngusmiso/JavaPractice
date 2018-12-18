package java2.finalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam06 {
	public static List<String> intersection(String[] a1, String[] a2) {
		List<String> list = Arrays.asList(a2);
		List<String> list2 = new ArrayList<>();
		for (String s : a1)
			if (list.contains(s) && !list2.contains(s))
				list2.add(s);
		return list2;
	}

	public static void main(String[] args) {
		String[] a1 = { "a", "d", "a", "b", "b", "c" };
		String[] a2 = { "c", "a", "e", "f", "b", "g" };
		List<String> list = intersection(a1, a2);
		System.out.println(list.toString());
	}
}