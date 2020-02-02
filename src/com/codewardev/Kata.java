package com.codewardev;

// https://www.codewars.com/kata/569d488d61b812a0f7000015/train/java

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {

	public static int[] DataReverse(int[] data) {
		int[][] newData = new int[data.length/8][8];
		for(int i=0; i<newData.length; i++) {
			newData[i] = Arrays.copyOfRange(data, i*8, i*8+8);
		}
		List<int[]> list = Arrays.asList(newData);
		Collections.reverse(list);
		int count=0;
		int[] result = new int[data.length];
		for(int i=0; i<newData.length; i++) {
			for(int j=0; j<newData[i].length; j++) {
				result[count++] = list.get(i)[j];
			}
		}
		
		return result;
	}

}
