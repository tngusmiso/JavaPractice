package javaPractice.Practice02;

import java.util.Objects;

public class Example01 {
	
	static Object[] obj;
	
	static void addData(int count) {
		obj = new Object[count*2];
		
		for(int i = 0; i<count; i++) {
			obj[2*i] = new Integer(i);
			obj[2*i+1] = String.valueOf(i);
		}
	}
	
	static int findIndex(int value) {
		Integer x = value;
		
		for(int i =0; i<obj.length/2; i++) {
			if(x.equals(obj[2*i])) 
				return i;
		}
		return -1;
	}
	
	static int findIndex(String value) {
		for(int i =0; i<obj.length/2; i++) {
			if(value.equals(obj[2*i+1])) 
				return i;
		}
		return -1;
	}
	
	public static void main (String[] args) {
		Example01.addData(5);
		System.out.println(Example01.findIndex(2));
		System.out.println(Example01.findIndex("3"));
	}
}
