package com.test;

interface  Bike {
	  void run();
}

public class Honda4 implements Bike {
	public void run() {
		System.out.println("running safely..");
	}
	
	void run1() {
		System.out.println("running not safely..");
	}

	public static void main(String args[]) {
		Bike obj = new Honda4();
		((Honda4) obj).run1();
	}
	
}