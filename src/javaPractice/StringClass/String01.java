package javaPractice.StringClass;

public class String01 {
	public String01(){
		String s = "hello world\n"; 
		String t = "Hello World\n"; 
		
		for (int i = 0; i < s.length(); ++i) 
			System.out.printf("%c", s.charAt(i));	// helloWorld
		
		System.out.println(s.compareTo(t) > 0); 		// 양수 true
		System.out.println(s.compareToIgnoreCase(t) == 0);	// true 
		System.out.println(s.contains("hello")); 		// true
		System.out.println(s.endsWith("rld\n")); 		// true
		System.out.println(s.equals(t) == false); 		// 같지 않으므로 true
		System.out.println(s.equalsIgnoreCase(t)); 		// true
		System.out.println(s.isEmpty() == false);		// 비어있지 않으므로 true
		System.out.println(s.indexOf("o") == 4); 		// true
		System.out.println(s.lastIndexOf("o") == 7);	// true
		System.out.println(s.length() == 12 ); 			// true 개행문자는 두글자 처럼 보여도 한글자임 
		System.out.println(s.startsWith("hell")); 		// true
		String[] a = s.split(" ");						//{"hello", "world\n"}
		System.out.println(a.length == 2); 				// true
		System.out.println(a[0].equals("hello")); 		// true
		System.out.println(s.substring(0, 5).equals("hello"));	//true index 0,1,2,3,4 에 해당하는 문자열만 나
		System.out.println(t.toLowerCase().equals(s));	// true
	}
}
