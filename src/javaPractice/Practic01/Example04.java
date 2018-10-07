package javaPractice.Practic01;

public class Example04 {
    static String removeO(String s) {
    	String newStr;
    	newStr = s.replace('o', '\0' );
    	newStr = newStr.replace('O', '\0' );
    	
    	return newStr;
    }
    
    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
        for (String s : a) {
            String temp = removeO(s);
            System.out.println(temp);
        }
    } 
}