package javaPractice.Array;

import java.util.Date;
import javaPractice.Person.Person;

public class ObjArray4 {
    
	public static void main(String[] args) {
        Object[] a = new Object[10];
		
        a[0] = "hello";
		a[1] = new String("world");
		a[2] = new Date();
		a[3] = new Person("홍길동", 13);
		a[4] = new int[] { 1, 2, 3 };
		a[5] = new String[] { "one", "two", "three" }; a[6] = new Integer(3);
		a[7] = new Double(3.14);
		a[8] = 3;		//기본자료형 int -> Integer 오토박싱 
		a[9] = 3.14;	//기본자료형 double -> Double 오토박싱 
        
		for (Object o : a) {
            System.out.println(o);
        }
    }
}
