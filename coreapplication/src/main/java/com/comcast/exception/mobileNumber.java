package com.comcast.exception;

@SuppressWarnings("serial")
class lengthException extends Exception {
	lengthException(String s){
		super(s);
	}
}

public class mobileNumber {
	public static void checkNum(long n) {
		try {
		if(Long.toString(n).length() != 10) {
			throw new lengthException("Not valid no. of digits");
		}
		} catch (lengthException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		long num = 987654321l;
		checkNum(num);

	}

}
