package com.leet;



public class Class2 implements Actionable {

    public void performAction() {
    
        // Code that depends on isActionable variable
        if (isActionable) {
            // Launch nuclear weapon!!!
        	System.out.println("Done2");
        }
    }
    
    public static void main(String[] args) {
		new Class2().performAction();
	}
}