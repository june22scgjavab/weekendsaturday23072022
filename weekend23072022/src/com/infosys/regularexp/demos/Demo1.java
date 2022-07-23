package com.infosys.regularexp.demos;

public class Demo1 {
/* ^ ===> The beginning of a line
 * $ ===> The end of a line
 * \\d===> digits
 * {n}===> exact number of times
 * () ====> used for grouping
 * ?! ====>Match if the suffix is absent.
 * so dont match 9 repeated 10 times
 * So (?![9]{10}) dont match 9 10 times
 * \\d{10}===> We need to have 10 digits
 * 
 */
	public static void main(String[] args) {
	String regexp1= "^(?![9]{10})\\d{10}$";
	String str="9999999999";
	System.out.println(str.matches(regexp1));
	}

}
