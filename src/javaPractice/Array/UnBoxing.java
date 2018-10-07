package javaPractice.Array;

public class UnBoxing {
	
    public static void main(String[] args) {
        
    	int i = 3;
        Integer obj1 = i;	// 오토뱍싱 Integer obj1 = new Integer(i);
        int j = obj1;		// 언박싱 int j = obj1.intValue();
        
        double d = 3.14;	
        Double obj2 = d;	// 오토뱍싱 Double obj2 = new Double(d);
        double f = d;		// 언뱍싱 double f = obj2.doubleValue();
        
        System.out.printf("%d %d %d\n", i, obj1, j);
        System.out.printf("%f %f %f\n", d, obj2, f);
    }
}