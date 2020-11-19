package com.techreturners.exercise001;

import java.util.HashMap;
import java.util.Map;

public class Exercise001 {

   

	// In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
    	int uniqueEleSum=0;
       Map<Integer,Integer> addFreq=new HashMap<>();
       
       for(int i=0;i<arr.length;i++) {
    	   if(addFreq.containsKey(arr[i])) {
    		   addFreq.put(arr[i], addFreq.get(arr[i])+1);
    	   }else {
    		   addFreq.put(arr[i], 1);
    	   }
       }
       for (Map.Entry<Integer, Integer> x : addFreq.entrySet()) {
           if (x.getValue() == 1) 
        	   uniqueEleSum+=x.getKey();
               
       }
  
	return uniqueEleSum;
    }
}
