package com.cognizant;

public class Switchtest {
public static void main(String[]args){
	int month=6;
	String season =null;
	switch(month){
	case 12:
	case 1:
	case 2:
season ="winter";
break;
	case 3:
	case 4:
	case 5:
		season="spring";
		break;
	case 6:
	case 7:
	case 8:
		season="summer";
		break;
	case 9:
	case 10:
	case 11:
		break;
			default:
				season="not valid month";
				
	}
	System.out.println("the month is"+ season);
}
}
