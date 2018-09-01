package com.logaday7;

import java.io.Serializable;

public class MyDate implements Serializable{
	public String  date;

	

	public MyDate(String date) {
		super();
		this.date = date;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}
	
	
	

}
