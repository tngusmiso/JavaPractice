package javaPractice.Practice02;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Example04 {
    public static void main(String[] args) {
    	Object[] a = new Object[3];
    	
    	a[0] = new Double[] {1.1, 2.2, 3.3};
    	a[1] = new String[] {"a","b","c"};
    	
    	Person p = new Person("임꺽정", 22);
    	a[2] = new Person[]{p,p};
    	
    	Object[] b = a;
    }
}