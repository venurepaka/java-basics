package com.test;



 class StaticTest {
/**
 * everytime when new StaticTest() is called, int will execute(initialize with explicit vlaue) and then constructor will execute
 */
	 int num=5;
	
	public StaticTest() {
		num+= 1;
	}
	public static void main(String[] args) {
		new StaticTest();
		new StaticTest();
		new StaticTest();
		System.out.println("count = "+new StaticTest().num); 
	}

}


   class StaticTest1 {
/**
 * static int num=5 will execute only once when the class is loaded ( because it is Static ). It maintains only one copy of num.
 * Everytime new StaticTest1() is called, static int num=5 will not be executed.
 */
	 static int num=5;
	
	public StaticTest1() {
		num+= 1;
	}
	public static void main(String[] args) {
		new StaticTest1();
		new StaticTest1();
		new StaticTest1();
		System.out.println("count = "+num); 
	}

}