package com.chandra.recurssion;

public class NumberOfDigits {

	 public static int count(int n) {
		 if(n==0) {
			 return 0;
		 }
		 
		 int smallAns=count(n/10);
		 
		 return 1+smallAns;
	 }
	public static void main(String[] args) {
		int n=110;
		
		System.out.print(count(n));
		
	}
}
