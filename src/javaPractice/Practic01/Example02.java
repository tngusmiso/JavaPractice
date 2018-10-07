package javaPractice.Practic01;

public class Example02 {
	
    static int getVowelCount(String s) {
    	
    	int count=0;
    	for(int i = 0;i<s.length();i++) {
    		switch(s.charAt(i)) {
    		case 'a': case 'A':
        	case 'e': case 'E':
    		case 'i': case 'I':
    		case 'o': case 'O':
    		case 'u': case 'U':
    			count++;
    		}
    	}
    	return count;
    }
    
    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };
        for (String s : a) {
            int count = getVowelCount(s);
            System.out.printf("%s %d\n", s, count);
        }
} }
