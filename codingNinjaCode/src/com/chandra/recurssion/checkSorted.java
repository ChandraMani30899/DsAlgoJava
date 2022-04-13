package com.chandra.recurssion;

public class checkSorted {

	 public static boolean check(int input[]) {
		 
		   if(input.length<=1)
			   return true;
		   
		   int smallInput[] = new int[input.length-1];
		   
		   for(int i=1;i<input.length;i++)
			   smallInput[i-1]=input[i];
		   
		   if(!check(smallInput))
			   return false;
		   
		   if(input[0]<=input[1])
			   return true;
		   
		   else return false;
	 
	 }
	
	 
	 public static boolean check_2(int input[]) {
		 
		   if(input.length<=1)
			   return true;
		   
		   if(input[0]>input[1]) {
			   return false;
		   }
		   int smallInput[] = new int[input.length-1];
		   
		   for(int i=1;i<input.length;i++)
			   smallInput[i-1]=input[i];
		  
		   return check_2(smallInput);
	 }
	 
	public static void main(String[] args) {
		int input[]= {1,1,3,4,5};
		
		System.out.println(check(input));
	}
}
