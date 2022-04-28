package com.comcast.threading;

class RunEx implements Runnable {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " - Begin with run method");
		for(int i = 0; i<5; i++) {
			System.out.println("Printing from " + threadName + " , value of i " + i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName + " - End with run method");
	}
}

public class RunExMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin Main thread");
		
		RunEx obj1 = new RunEx();
		RunEx obj2 = new RunEx();
		
		Thread t1 = Thread.currentThread();
		t1.setName("Cop");
		
		Thread t2 = new Thread(obj1, "Tri");
		Thread t3 = new Thread(obj2, "Oh");
		
		t2.start();
		t3.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Printing from " + t1.getName() + " , value of i " + i);
			Thread.sleep(1000);
		}
		
		t2.join();
		t3.join();
		
		System.out.println("End main method");
	}

}
