package javaPractice.thread;

import java.util.Random;

class ThreadA extends Thread{	// Thread 클래스 상속 
	String name;
	Random random;
	
	public ThreadA(String name) {
		this.name = name;
		this.random = new Random();
	}
	
	@Override
	public void run() {			// run 메소드 재정의 
		System.out.printf("%s: started\n", name);
		
		try {
			for(int i =0;i<100;++i) {
				System.out.printf("%s: %d\n", name, i);
				int mili_second = random.nextInt(100);
				sleep(mili_second);
			}
		}catch(InterruptedException e){
			System.out.printf("%s: interrupted\n",name);
		}
		System.out.printf("%s: stoped\n", name);
		
	}
}

public class Example01 {

	public static void main(String[] args) {
		//스레드 객체 생성 
		Thread threadOne = new ThreadA("one");
		Thread threadTwo = new ThreadA("two");
		Thread threadThree = new ThreadA("three");
		
		//새로운 스레드 실행 
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}
