package com.test;

class Static {
    static int frogCount = 0;  // Declare and initialize
                        // instance variable
    public Static() {
       frogCount += 1;  // Modify the value in the constructor
    }
    public static void main (String [] args) {
       new Static();
       new Static();
       new Static();
       System.out.println("Frog count is now " +frogCount);
} }