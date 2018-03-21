package com.basic.java.questions;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public class Range{
	    int startIndex;
	    int endIndex;
	    
	    public Range(int stat,int end) {
			this.startIndex = stat;
			this.endIndex = end;
		}
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "range : "+this.startIndex+":"+this.endIndex;
	    }
	}


	public List<Range> findNonZeroRanges(int[] arr){
	    
	    List<Range> ranges = new ArrayList<Range>();
	    if(arr != null && arr.length >0){
	        int startIndex = 0; int prevValue = arr[0];
	        int endIndex = 0;
	        for(int i=0;i<arr.length;i++){
	           
	            if(arr[i]!=0 ){
	                endIndex =i;
	                if(prevValue == 0){
	                    startIndex=i;
	                }
	            }else{
	                if(prevValue !=0){
	                   ranges.add(new Range(startIndex,endIndex));
	                   
	                }
	                
	                  
	            }
	            prevValue = arr[i];
	            
	        }
	        
	    }
	    return ranges;

	}
	public static void main(String[] args) {
		int arr[] = new int[]{2,5,1,0,0,0,3};
		Test t = new Test();
		System.err.println(t.findNonZeroRanges(arr));
	}
}
