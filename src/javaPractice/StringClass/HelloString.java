package javaPractice.StringClass;

import javaPractice.immutable.*;
import javaPractice.ObjectClass.*;

public class HelloString {

	public HelloString(){
String origin = " Hello this is String Class methods!";
		
		System.out.println("index 위치의 문자 리턴");
		System.out.println(origin.charAt(4));	//o
		
		System.out.println("문자열 비교 (알파벳 순서로)");
		System.out.println(origin.compareTo(" hello"));	//this 문자열이 앞임. 따라서 음리턴 
		System.out.println(origin.compareTo(origin));//같은 문자열이므로 0리턴 
		System.out.println(origin.compareTo(" Hello")); //this 문자열이 뒤임. 따라서 양리턴
		
		System.out.println("문자열 비교 (대소문자 구분 없이)");
		System.out.println(origin.compareToIgnoreCase(" Iello"));	//음수 리턴 
		System.out.println(origin.compareToIgnoreCase(" hello this is sTring class mEthods!")); //0리턴
		System.out.println(origin.compareToIgnoreCase(" bello"));	//양수 리턴 
		
		System.out.println("this 문자열이 s를 포함하는가??");
		System.out.println(origin.contains("class"));	//false. 대소문자 구분
		
		System.out.println("this 문자열이 s로 끝나는가??");
		System.out.println(origin.endsWith("s!"));	//true
		
		System.out.println("this 문자열이 s로 시작하는가?");
		System.out.println(origin.startsWith(" Hell"));	//true
		
		System.out.println("this 문자열이 s와 일치하는가??");
		System.out.println(origin.equals(" Hello this is String Class methods!"));	//true
		
		System.out.println("this 문자열이 s와 일치하는가? (대소문자 구분 없이)");
		System.out.println(origin.equalsIgnoreCase(" Hello this is String class methods!"));	//true
		
		System.out.println("C언어의 printf 함수와 비슷하다");
		System.out.println(String.format("this is format! five: %d", 5));
		
		System.out.println("문자열 s의 위치는? (인덱스)");
		System.out.println(origin.indexOf("Class"));	//21
		System.out.println(origin.indexOf("is"));	//첫번째! 8
		
		System.out.println("문자열이 빈 문자열인가?");
		System.out.println(origin.isEmpty());	//false
		System.out.println("".isEmpty());		//true
		
		System.out.println("문자열 s가 포함된 마지막 위치는?");
		System.out.println(origin.lastIndexOf("is"));	//마지막 문자열의 시작위 11
		
		System.out.println("문자열의 길이는?");
		System.out.println(origin.length());
		
		System.out.println("regix와 일치하는가 ");
		System.out.println(">>matches");
		
		System.out.println("포함된 문자열 \"is\"을 모두찾아서 \"IS\"로 치환한다.");
		System.out.println(origin.replace("is", "IS"));
		
		System.out.println("정규식 regix와 일치하는 부분을 모두 찾아서 s2로 치환한다.");
		System.out.println("replaceAll");
		
		System.out.println("정규식 regix와 일치하는 부분을 기준으로 this 문자열을 쪼갠다.");
		String[] str = origin.split(" ");
		for(String s:str) System.out.println(s);
		
		System.out.println("beginIndex위치부터 끝까지 리턴.");
		System.out.println(origin.substring(15));
		
		System.out.println("beginIndex 위치부터 endIndex 앞까지 리턴.");
		System.out.println(origin.substring(20, 25));
		
		System.out.println("모두 소문자로!");
		System.out.println(origin.toLowerCase());
		
		System.out.println("모두 대문자로!");
		System.out.println(origin.toUpperCase());
		
		System.out.println("문자열의 앞 뒤 공백 제거");
		System.out.println(origin.trim());
		
		System.out.println("Int i값을 문자열로 변환하여 리턴한다.");
		System.out.println(String.valueOf(5));
		
		System.out.println("Double d값을 문자열로 변환하여 리턴한다.");
		System.out.println(String.valueOf(6.9));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String03 obj = new String03();
	}

}
