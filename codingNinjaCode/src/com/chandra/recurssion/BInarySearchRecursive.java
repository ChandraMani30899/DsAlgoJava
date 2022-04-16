package com.chandra.recurssion;

public class BInarySearchRecursive {

	public static int binarySearchHelper(int[] input,int element,int si,int ei) {
		 
		   if(si>ei)
			 return -1;
		
		   int mid = (si+ei)/2;
		   
		   if(input[mid]==element)
			   return mid;
		   
		   if(input[mid]>element)
			   return binarySearchHelper(input,element,si,mid-1);
		   
		   return binarySearchHelper(input,element,mid+1,ei);
	}
	
	public static int binarySearch(int input[], int element) {
		      return binarySearchHelper(input,element,0,input.length-1);

	}
	
	public static void main(String[] args) {
		
	}
}
