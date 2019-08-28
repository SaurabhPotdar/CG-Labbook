package com.cg.practice.customexception;

@SuppressWarnings("serial")
public class WrongAgeException extends Exception{
	public WrongAgeException(String s) {
		super(s);
	}
}
