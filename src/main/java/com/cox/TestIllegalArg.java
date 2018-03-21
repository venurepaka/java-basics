package com.cox;

public class TestIllegalArg {

	public static void main(String[] args) throws MyIllegalArgumentException {
//		StringBuffer sb = new StringBuffer();
//		sb.append("hi");
	    Percentage percentage = new Percentage(121);
	    System.out.println(percentage.getValue());
	  }
	
}

class MyIllegalArgumentException extends Exception{
	
	public MyIllegalArgumentException(String message) {
		super(message);
	}
	
	
}




  class Percentage {
	  private final int value;

	  /**
	   * A percentage value must be between 0 and 100 inclusive.
	   * 
	   * @param value
	   *          the percentage value
	 * @throws MyIllegalArgumentException 
	   */
	  public Percentage(int value) throws MyIllegalArgumentException {
	    if (value < 0 || value > 100) {
	      throw new MyIllegalArgumentException(Integer.toString(value)+"_custom");
	    }
	    this.value = value;
	  }

	  public int getValue() {
	    return value;
	  }
	}