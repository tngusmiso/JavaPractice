package javaPractice.Person;

import java.util.Objects;

public class Person {
	 String name;
	 int age;
	 
     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }
     
     @Override
     public boolean equals(Object obj) {
         if ((obj instanceof Person) == false) return false;
         Person p = (Person)obj;
         
         //return this.name.equals(p.name) && this.age == p.age;
         // this.name이 null 이면 NullPointerException 발생
         
         //return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
         // NullPointerException 에러 해결! 하지만 문장이 너무 길다.
         
         return Objects.equals(this.name, p.name) && this.age == p.age;
         // 참조형 멤버변수는 java.util.Objects를 사용하면 간편하다.
     }
}
