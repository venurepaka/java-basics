package com.test;


class Child extends Parent {
	public void testIt() {
		System.out.println("x is " + x); // No problem; Child
		// inherits x
	}
	
	public static void main(String[] args) {
		new Child().testIt();
	}
}

