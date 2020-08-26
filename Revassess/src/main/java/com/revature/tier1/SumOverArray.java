package com.revature.tier1;



public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int[] array = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		int sum = 0;
		for (int i = 0;i<array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("The sum of the array elements is :" + sum);
		
		return 0;
	}
}
