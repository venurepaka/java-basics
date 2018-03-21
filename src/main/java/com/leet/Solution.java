package com.leet;

import java.util.HashSet;
import java.util.Set;

class Solution {
    
    public static void main(String[] args){
        int[] nums = new int[]{1,2,1};
        Solution solution = new Solution();
        
       // System.out.println(solution.removeDuplicates(nums));
        
        //System.out.println(solution.containsDuplicates(nums));
        
        int[][] arr2D = new int[][] {{1,2,3},
							        	{4,5,6},
							        	{7,8,9}};
							        	
							        	//print2D(arr2D);		        	
							        
}
    static void print2D(int[][] arr2d) {
    	
    	for(int i=0; i<arr2d.length; i++){
    		for(int j=0; j<arr2d[i].length; j++) {
    			System.out.print(arr2d[i][j]);
    			if(j == arr2d[i].length-1)
    				System.out.println();
    		}
    	}
    }
    
    
    public int removeDuplicates(int[] nums) {
    		Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            
        }
        System.out.println(set);
        return set.size();
    }
       
     
    public boolean containsDuplicates(int[] nums) {
    	Set<Integer> set = new HashSet<>();
    	int count = 0;
    	boolean dupFlag = false;
    	for(int i=0; i<=nums.length-1; i++) {
    		if(set.add(nums[i]) == false) {
    			count++;
    		}
    		
    		if(count >= 1)
    			dupFlag = true;
    	}
		return dupFlag;
    	
    }
    
}
    
