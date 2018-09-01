package com.logaday7;

public class MagicDates {
	public static boolean isMagicDate(int month, int date, int year) {
		if(month * date == year) {
			System.out.println("Date is magic!");
		}
		else
		{
			System.out.println("Date is notmagic!");
		}
		return true;
	}

}
