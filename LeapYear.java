package com.bridgelabz.fellowship.basiccoreprograms;

import java.util.InputMismatchException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.utils.InputUtility;
import com.bridgelabz.fellowship.utils.LogUtility;
import com.bridgelabz.fellowship.utils.UserDefinedException;
import com.bridgelabz.fellowship.utils.Utility;

public class LeapYear {
	public static void main(String[] args) throws UserDefinedException {
		
		System.out.println("enter the year :");
		try {
			
			int year = InputUtility.getInt();
			boolean rs = Utility.isLeapYear(year);
			if (rs == true)
				System.out.println(year + " : is a leap year ");
			else
				System.out.println(year + " : is not a leap year");
		} catch (UserDefinedException e) {
			//logger.error("invalid input");
			throw new UserDefinedException("number should be graeter than 1582 && and only 4 digit");
			
		}
		catch(InputMismatchException e){
			throw new UserDefinedException("invalid input");
		}
	}
}
    