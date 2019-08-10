package week4.day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Date1 {
public static void main(String[] args) {
	Date date = new Date();
	DateFormat aaa= new SimpleDateFormat("dd");
	String today = aaa.format(date);
	int tommorow = Integer.parseInt(today)+1;
	System.out.println(tommorow);

	
}
}
