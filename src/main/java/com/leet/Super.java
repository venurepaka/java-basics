package com.leet;

/* superclass Person */
class Person
{
    Person()
    {
        System.out.println("Person class Constructor");
    }
}
 
/* subclass Student extending the Person class */
class Student extends Person
{
	
	
    Student()
    {
        // invoke or call parent class constructor
        //super();
 
        System.out.println("Student class Constructor");
    }
    
    public void m1() {
    	 int i = 5;
      
    	System.out.println(i);
//    	try{
//    	    System.out.println("I am in try block");
//    	    System.exit(1);
//    	} catch(Exception ex){
//    	    ex.printStackTrace();
//    	} finally {
//    	    System.out.println("I am in finally block!!!");
//    	}
    	
    }
    	
//    	final int i;
//        i = 30;
}
 
/* Driver program to test*/
public class Super
{
    public static void main(String[] args)
    {
        Student s = new Student();
        
        s.m1();
    }
}