package com.chandra.recurssion;

public class PrintNumbers {

	public static void print(int n) {
	      if(n==1)
	      { System.out.print(1+" ");
	        return;
	      }
		print(n-1);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		int n=10;
		print(n);
	}
}
