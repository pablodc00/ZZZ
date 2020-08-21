package com.dummy.work;

import java.awt.Point;

public class MainPrint {

	public static void main(String[] args) {
		Point pointA = new Point(3,6);
		Point pointB = new Point(3,6);
		
		boolean result1 = pointA.equals(pointB);
		boolean result2 = pointA == pointB;

		System.out.println(result1);
		System.out.println(result2);
	}

}

