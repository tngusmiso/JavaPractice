package javaPractice.Array;

public class ObjArray1 {
	
    public static void main(String[] args) {
    	
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 1, 2, 3 };
        String[] c = new String[] { "one", "two", "three" };
        
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
        System.out.println(a.equals(b));	// identity 비교 
    }
}