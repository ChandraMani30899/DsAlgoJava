package com.chandra.recurssion;

public class AllIndexesOfNumber {
	public static int[] allIndexes(int input[], int x, int start, int result[]) {
		if (start == input.length) {
			return result;
		}

		if (input[start] == x) {
			int newResult[] = new int[result.length + 1];

			for (int i = 0; i < result.length; i++) {
				newResult[i] = result[i];
			}
			newResult[result.length] = start;
			return allIndexes(input, x, start + 1, newResult);
		}

		return allIndexes(input, x, start + 1, result);
	}

	public static int[] allIndexes(int input[], int x) {
		int result[] = new int[0];
		return allIndexes(input, x, 0, result);
	}

}
