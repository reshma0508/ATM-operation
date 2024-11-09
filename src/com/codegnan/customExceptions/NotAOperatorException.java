package com.codegnan.customExceptions;

public class NotAOperatorException extends Exception { // checked exception
	public NotAOperatorException(String errorMsg) {
		super(errorMsg);

	}

}