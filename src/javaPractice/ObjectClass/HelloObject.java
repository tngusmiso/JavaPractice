package javaPractice.ObjectClass;

public class HelloObject {

	public HelloObject() {
		Object[] obj = new Object[] {"hello"};
		

		System.out.println("객체의 내용을 문자열로 리턴 ");	//재정의 필
		System.out.println(obj.toString());
		
		System.out.println("자기 자신 복제하기.");//재정의 필요
		System.out.println(obj.clone().toString());
		
		System.out.println("동일한 객체인지 비교 ");	//재정의 필요
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj.clone()));
		
		System.out.println("객체의 클래스에 대한 정보 ");
		System.out.println(obj.getClass());
		
		System.out.println("해시값 ");
		System.out.println(obj.hashCode());

		System.out.println("메모리 회수 전 객체 파괴하기 ");	//protect
		System.out.println("obj.finalize()");
		
		
	}
}
