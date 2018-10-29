package javaPractice.thread;

import java.util.Random;

class RunnableA implements Runnable{	// Runnable 인터페이스 구현 
	String name;
	Random random;
	
	public RunnableA(String name) {
		this.name = name;
		this.random = new Random();
	}
	
	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		
		try {
			for(int i =0;i<100;++i) {
				System.out.printf("%s: %d\n", name, i);
				int mili_second = random.nextInt(100);
				Thread.sleep(mili_second);	//Thread클래스의 sleep함수 호출 
			}
		}catch(InterruptedException e){
			System.out.printf("%s: interrupted\n",name);
		}
		System.out.printf("%s: stoped\n", name);
		
	}
}

public class Example02 {

	public static void main(String[] args) {
		//스레드 객체 생성 
		Thread threadOne = new Thread(new RunnableA("one"));
		Thread threadTwo = new Thread(new RunnableA("two"));
		Thread threadThree = new Thread(new RunnableA("three"));
		
		//새로운 스레드 실행 
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}
