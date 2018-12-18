package java2.finalExam;

import java.util.ArrayList;
import java.util.List;

public class Exam05 {
	public static List<String> union(String[] a1, String[] a2) {
		List<String> list = new ArrayList<>();
		
		for(String s : a1) {
			if(!list.contains(s))
				list.add(s);
		}
		for(String s2 : a2) {
			if(!list.contains(s2))
				list.add(s2);
		}
		return list;		
	}

	public static void main(String[] args) {
		String[] a1 = { "a", "d", "a", "b", "b", "c" };
		String[] a2 = { "c", "a", "e", "f", "b", "g" };
		List<String> list = union(a1, a2);
		System.out.println(list.toString());
	}
}
