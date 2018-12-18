package java2.finalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam01 {
	public static List<String> solution(List<String> list) {
		// 구현하라.
		List<String> list2 = new ArrayList<>();
        for (String s : list)
            if (!list2.contains(s))
                list2.add(s);
        
        return list2;
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("d", "a", "b", "a", "c", "d", "e", "f", "e"));
		List<String> list2 = solution(list1);
		System.out.println(list1);
		System.out.println(list2);
	}
}
