package com.chandra.sorting;

public class QuickSort {

	public static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}

	public static void quickSortHelper(int[] input, int si, int ei) {
		if (si >= ei)
			return;

		// finding the pivot position
		int pivotPos = partition(input, si, ei);
		quickSortHelper(input, si, pivotPos - 1);
		quickSortHelper(input, pivotPos + 1, ei);
	}

	// here pivot element is first
	public static int partition(int input[], int si, int ei) {

		int pivotPos = si;

		// finding the correct position of pivot
		for (int i = si + 1; i <= ei; i++) {

			if (input[i] <= input[si]) {
				pivotPos++;
			}
		}

		swap(input,si,pivotPos);

		int i = si;
		int j = ei;

		//Positioning the elements at correct position according to pivot
		while (i < pivotPos) {
			if (input[i] > input[pivotPos]) {
				while (input[j] > input[pivotPos]) {
					j--;
				}
				if (j > pivotPos) {
					swap(input,i,j);
				}
			}
			i++;
		}

		return pivotPos;
	}

	public static void quickSort(int[] input) {

		quickSortHelper(input, 0, input.length - 1);
	}

	public static void main(String[] args) {
		int[] input = { 9, 8, 4, 7, 3, 6, 3, 5 };
		
		quickSort(input);

		for (int i : input) {
			System.out.print(i + " ");
		}
	}
}
