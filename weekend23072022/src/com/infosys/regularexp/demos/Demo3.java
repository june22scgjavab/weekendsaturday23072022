package com.infosys.regularexp.demos;


/*
 * The string can start with either BNK OR TRV OR IS followed by - and ending up with 4 digits
 | (Pipe) symbol is used for OR which means match if the string starts with BNK or TRV or INS and if we have any other pattern , it wont match 
 */
public class Demo3 {

	public static void main(String[] args) {
	String regex="^(BNK|TRV|INS)-\\d{4}$";
    System.out.println("BNK-1234".matches(regex));
    System.out.println("ATC-1234".matches(regex));
    System.out.println("BNK1234".matches(regex));
	}

}
