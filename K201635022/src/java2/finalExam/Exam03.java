package java2.finalExam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam03 {
	public static void solution(String s) { 
		// 구현하라
		String regex = "[0-9]+";
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(s);
		
		while (matcher.find())
			System.out.println(matcher.group(0));
	}

	public static void main(String[] args) {
		String s = "a1223 (235) 157, 7814; asd_32as";
		solution(s);
	}
}
