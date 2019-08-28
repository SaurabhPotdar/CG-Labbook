package com.cg.practice.customexception;

@SuppressWarnings("serial")
public class WrongNameException extends Exception{
	public WrongNameException(String s) {
		super(s);
	}
}
