package com.leet;



public class Class1 implements Actionable {

    public void performAction() {
        // Code that depends on isActionable variable
        if (isActionable) {
            // Launch nuclear weapon!!!
        	System.out.println("Done");
        }
    }
    
    public static void main(String[] args) {
		new Class1().performAction();
		
	}
}