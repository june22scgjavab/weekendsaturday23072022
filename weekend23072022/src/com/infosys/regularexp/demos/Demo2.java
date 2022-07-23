package com.infosys.regularexp.demos;
/*
 * (?i)==> match the characters found ignoring the case, i is for ignoring the case
 * [a-z] means alphabets
 * + means repeating the characters once or more
 * 
 */
public class Demo2 {

	public static void main(String[] args) {
		String regexp1= "^(?i)[a-z]+$";
		System.out.println("hello".matches(regexp1));
		System.out.println("HELLO".matches(regexp1));
		System.out.println("12LLO".matches(regexp1));
		System.out.println("".matches(regexp1));
		
	}

}
