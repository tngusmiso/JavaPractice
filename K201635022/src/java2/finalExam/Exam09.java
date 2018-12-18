package java2.finalExam;

import java.util.Arrays;

public class Exam09 {
	public static String[] insert(String[] a, int index, String s) {
		String[] b = Arrays.copyOf(a, a.length+1);
		
		for (int i = b.length - 1; i > index; --i)
            b[i] = b[i - 1];
        b[index] = s;
        
        return b;
	}

	public static void main(String[] args) {
		String[] a = { "a", "c", "d", "f", "g", "h" };
		a = insert(a, 1, "b");
		a = insert(a, 4, "e");
		System.out.println(Arrays.toString(a));
	}
}