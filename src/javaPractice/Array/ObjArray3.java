package javaPractice.Array;

import java.util.Date;
import javaPractice.Person.Person;

public class ObjArray3 {
    public static void main(String[] args) {
        Object[] a = new Object[8];
        
        a[0] = "hello";
		a[1] = new String("world");
		a[2] = new Date();
		a[3] = new Person("홍길동", 13);
		a[4] = new int[] { 1, 2, 3 };
		a[5] = new String[] { "one", "two", "three" }; 
		a[6] = new Integer(3);		//기본자료형 -> 객체 
		a[7] = new Double(3.14);	//기본자료형 -> 객체 
        
		for (Object o : a) {
            System.out.println(o);
        }
		
		//기본 자료형 클래스에 equals 메소드가 재정의 되어 있을까??
		Integer i1 = new Integer(3);
		Integer i2 = new Integer(3);
		System.out.println(i1.equals(i2));
		
    }
}