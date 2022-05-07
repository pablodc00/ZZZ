package com.dummy.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LargestRectangleHistogramWithStack {

	private static int height, tempHeight, tempPos;
	private static Stack<Integer> heightStack = new Stack<>();
	private static Stack<Integer> posStack = new Stack<>();
	private static int maxSize = Integer.MIN_VALUE;
	private static int tempSize = 0;

	public static void main(String[] args) {
		List<Integer> hist;
		//hist = Arrays.asList(1, 3, 2, 1, 2); //5
		// hist = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 2, 1, 0, 8); //14
		// hist = Arrays.asList(5, 5, 1, 0, 1, 0, 1); //10
		// hist = Arrays.asList(6, 5, 4, 0, 1, 0, 1); //12
		// hist = Arrays.asList(0, 1, 0, 1, 0, 5, 6); //10
		// hist = Arrays.asList(5, 1, 1, 1, 1, 1, 0); //6
		// hist = Arrays.asList(5, 4, 3, 2, 1); //9
		//hist = Arrays.asList(5, 4, 6, 3, 2, 1); //12
		// hist = Arrays.asList(1); //1
		hist = Arrays.asList(4, 5, 6, 3, 2, 1); //

		largestRectangle(hist);
		System.out.println(maxSize);
	}
	

	private static void largestRectangle(List<Integer> hist) {
		for (int pos = 0; pos < hist.size(); pos++) {

			height = hist.get(pos);
			
			if (heightStack.size() == 0 || height > heightStack.peek()) {
				heightStack.push(height);
				posStack.push(pos);
				
			} else if (height < heightStack.peek()) {
				while (heightStack.size() > 0 && height < heightStack.peek()) {
					popStuff(pos);
				}
				heightStack.push(height);
				posStack.push(tempPos);
			}
		}
		
		while (heightStack.size() > 0) {
			popStuff(hist.size());
		}
	}

	private static void popStuff(int pos) {
		tempHeight = heightStack.pop();
		tempPos = posStack.pop();
		tempSize = tempHeight * (pos - tempPos);
		maxSize = Math.max(tempSize, maxSize);
	}
	
	
}
