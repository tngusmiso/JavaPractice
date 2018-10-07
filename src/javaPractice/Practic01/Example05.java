package javaPractice.Practic01;

public class Example05 {
    static String[] split1(String s) {
    	String str = s.replace(' ', '\0');
    	return str.split(",");
    	
    
    	
    	
    }
    static String[] split2(String s) {
    	String[] t = s.split(",");
    	for(int i = 0; i<t.length;i++){
    		t[i] = t[i].trim();
    	}
    	return t;
    }
    
    public static void main(String[] args) {
        String s = "One, Two ,Three , Four,Five";
        String[] a1 = split1(s);
        for (String t : a1)
            System.out.printf("[%s]\n", t);
        String[] a2 = split2(s);
        for (String t : a2) {
        	System.out.printf("[%s]\n", t);
        }
    }
}