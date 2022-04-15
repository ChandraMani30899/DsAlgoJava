package com.chandra.sorting;

public class MergeSort {

	public static void mergeSortHelp(int[] input,int si,int ei) {
		if(si>=ei)
			return;
		
		int mid=(ei + si) /2;
		
		mergeSortHelp(input,si,mid);
		mergeSortHelp(input,mid+1,ei);
		merge(input,si,ei);
	}
	
	public static void merge(int[] input,int si,int ei) {
		if(si>=ei)
			return;
		
		int length=ei-si+1;
		int mid=(ei + si)/2;
		int s1=si;
		int s2=mid+1;
		int[] output = new int[length];
		
		int i=0;
		
		while(s1<=mid && s2<=ei) {
			if(input[s1]<=input[s2]) {
				output[i]=input[s1];
				s1++;
				i++;
			}
			else {
				output[i]=input[s2];
				s2++;
				i++;
			}
		}
		
		while(s1<=mid) {
			output[i]=input[s1];
			s1++;
			i++;

		}
				while(s2<=ei){
			output[i]=input[s2];
			s2++;
			i++;
		}

		int j=si;
		
		
		for(int obj:output) {
			input[j]=obj;
			j++;
		}
		
		
	}
	
	public static void  mergeSort(int[] input) {
		 mergeSortHelp(input,0,input.length-1);
	}
	
	
	public static void main(String[] args) {
		int[] input= {9,8,4,7,3,6,3,5};
		//int[] input = {2,1,3};
		   mergeSort(input);
		   
		   for(int i:input) {
			   System.out.print(i+" ");
		   }
	}
}
