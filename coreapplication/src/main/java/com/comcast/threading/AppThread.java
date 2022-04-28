package com.comcast.threading;

class A{
	void methodA() {
		System.out.println("Thread A is Executed");
	}
}

public class AppThread {

	public static void main(String[] args) {
		System.out.println("Application Thread is initiated");
		System.out.println("Application Thread is running");
		
		Thread t1 = Thread.currentThread();
		t1.setName("comcast");
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1);
		
		A objA = new A();
		objA.methodA();
		System.out.println("Application thread is stopped");

	}

}
