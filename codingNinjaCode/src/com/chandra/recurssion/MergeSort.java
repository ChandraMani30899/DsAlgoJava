package com.chandra.recurssion;

import java.util.Arrays;
import java.util.Iterator;

public class MergeSort {
	
	public static void mergeSorthelp(int[] input,int si,int end) {
		if(si>=end)
			return;
		
		int mid=(end+si)/2;
		
		mergeSorthelp(input,si,mid);
		mergeSorthelp(input,mid+1,end);
		merge(input,si,end);
		
	}
	private static void merge(int[] input, int si, int end) {
		int length=end-si+1;
		int[] output=new int[length];
		
		int mid=(end+si)/2;
		int s1=si;
		int s2=mid+1;
		int i=0;
		while(s1<=mid && s2<=end) {
			if(input[s1]<=input[s2]) {
				output[i]=input[s1];
				i++;
				s1++;
			}
			else {
				output[i]=input[s2];
				i++;
				s2++;

			}
		}
		
		while(s1<=mid) {
			output[i]=input[s1];
			i++;
			s1++;
		}
		while(s2<=end) {
			output[i]=input[s2];
			i++;
			s2++;
		}
		
		for(int j=si,k=0;j<=end && k<length;j++,k++) {
			input[j]=output[k];
		}
		
	}
	public static void mergeSort(int[] input){
		
		 mergeSorthelp(input,0,input.length-1);
	}
	
	public static void main(String[] args) {
		int input[]={5,6,8,3,4,2,1};
		mergeSort(input);
		for(int i:input) {
			System.out.println(i);
		}
	}
}