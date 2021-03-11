package com.oracle.oca11.exam.prep.binary;

public class Binary {

	static void binary() {
		// int binary 
		// -3 = 11111111111111111111111111111101
		// -2 = 11111111111111111111111111111110
		// -1 = 11111111111111111111111111111111
		// 0 = 00000000000000000000000000000000
		// 1 = 00000000000000000000000000000001
		// 2 = 00000000000000000000000000000010
		// 3 = 00000000000000000000000000000011

		int a = 2;
		int b = ~a; // b is -3
		System.out.println("~ bitwise complement operator inverts all bits of a number, this is mirrored so b is " + b);
		//essentially will turn the binary into the opposite values
	}

	public static void main(String[] args) {
		binary();
	}

}
