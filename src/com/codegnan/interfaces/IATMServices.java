package com.codegnan.interfaces;

import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;

public interface IATMServices {
	// to get the user type whether the user is operator or normal user
	public abstract String getUserType() throws NotAOperatorException;
    //to withdraw amount these 3 types of exceptions will be raised
	//1.will throw InvalidAmountException if amount is not valid denomination
	//2.will throw InsufficientBalanceException if customer has insufficient balance
	//3.will throw InsufficientMachineBalanceException if the machine has insufficient cash.
	public abstract double  withdrawAmount(double wthAmount)throws InvalidAmountException,InsufficientBalanceException,InsufficientMachineBalanceException;
	//to deposit amount
	public abstract void depositAmount(double deptAmount)throws InvalidAmountException;
	//to check balance
	public abstract double checkAccountBalance();
	//to change PIN number
	public abstract void changePinNumber(int pinNumber);
	//get pin number
	public abstract int getPinNumber();
	//to get the user name
	public abstract String getUserName();
	//to decrease the number of chances while entering the wrong pin number
	public abstract void decreaseChances();
	//to get the chances of pin number
	public abstract int getChances();
	//to reset the pin number chances by bank operator
	public abstract void resetPinChances();
	//to generate MINI statement
	public abstract void generateMiniStatement();
	




}