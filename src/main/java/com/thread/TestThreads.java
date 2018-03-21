package com.thread;

public class TestThreads {

	public static void main(String[] args) {
		MyRunnable myJob = new MyRunnable();
		//MyThread myJob = new MyThread();
		Thread t1 = new Thread(myJob);
		Thread t2 = new Thread(myJob);
		
		t1.start();
		t2.start();
	}
	
	
	
}
