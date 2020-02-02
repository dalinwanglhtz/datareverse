package com.codewardev;

// https://www.codewars.com/kata/569d488d61b812a0f7000015/train/java

import java.util.Arrays;

public class Kata {

	private static final int BYTELENGTH = 8;
	
	public static int[] DataReverse(int[] data) {
		int[][] newData = new int[data.length/BYTELENGTH][BYTELENGTH];
		for(int i=0; i<newData.length; i++) {
			newData[i] = Arrays.copyOfRange(data, i*BYTELENGTH, (i+1)*BYTELENGTH);
		}
		int[] result = new int[data.length];
		for(int i=newData.length-1; i>=0; i--) {
			System.arraycopy(newData[i], 0, result, (newData.length-i-1)*BYTELENGTH, BYTELENGTH);
		}
		
		return result;
	}

}
