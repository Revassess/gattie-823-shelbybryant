package com.revature.tier1;

public class NumberSumLength {

	
	
	public static boolean checkNumberPowerLength(long num) {
		//the long num is 
		int number = 5;
		long overallLength = (int) (Math.log10(number) +1);
		
		int sum = 0;
		int result = (int)Math.pow(number, overallLength);
		while (result != 0) {
			int n = result % 10;
			sum += n;
			result /= 10;
		}
		
		if (sum == number) {
			return true;
		}else {
			return false;
		}
		
	}
}
