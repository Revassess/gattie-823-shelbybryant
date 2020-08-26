package com.revature.tier1;

import java.util.stream.IntStream;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int[] array = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		int sum = IntStream.of(array).sum();
		
		if(sum == 10) {
			System.out.println("The sum of the array is " + sum);
		} else {
			System.out.println("There was an error calculating the sum of the array");
		}
		
		
		return 0;
	}
}
