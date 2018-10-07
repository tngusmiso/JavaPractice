package javaPractice.Practic01;

public class Example04 {
    static String removeO(String s) {
    	String newStr;
    	newStr = s.replace('o', ' ' );
    	newStr = newStr.replace('O', ' ' );
    	
    	return newStr.trim();
    }
    
    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
        for (String s : a) {
            String temp = removeO(s);
            System.out.println(temp);
        }
    } 
}