package com.dummy.work;

import java.time.LocalDate;
import java.util.Date;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long date = new Date().getTime();
		System.out.println(date);
		
		LocalDate localDate = LocalDate.parse("nada");
		System.out.println(localDate);
	}

}
