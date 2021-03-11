package com.oracle.oca11.exam.prep.bitwise.operators;

public class BitwiseOperators {
	
	static void compareCorrespondingBits() {
		byte a = 5; //00000101
		byte b = 3; //00000011
		byte c = (byte) (a & b); //00000001 (c is 1)
		System.out.println(c);
		//bitwise AND & when both bits are 1, the result is 1, or either of the bits is not 1, the result is 0
		byte d = (byte) (a | b); //00000111 (d is 7)
		System.out.println(d);
		//bitwise OR | when either of the bits is 1, the result us 1, otherwise, the result is 0.
		byte e = (byte) (a ^ b); //00000110 (e is 6)
		System.out.println(e);
		//bitwise exclusive OR ^ when corresponding bits are different, the result is 1, otherwise, the result is  0.
		
	}
	
	static void shiftLeftOrRight() {
		int a = 5; //00000000000000000000000000000101
		int b = -5; //11111111111111111111111111111011
		//signed left shift << shifts each bit to the left by the specified number of positions, fills low-order with 0 bit values
		int c = a << 2; //00000000000000000000000000010100 (c is 20)
		int d = b << 2; //11111111111111111111111111101100 ( d is -20)
		//signed right >> shifts each bit to the right by specified number position 
		int e = a >> 2; //00000000000000000000000000000001 ( e is 1)
		int f = b >> 2; //11111111111111111111111111111110 (f is -2)
		//unsigned right shift >>> same as above, but fills high-order values with 0 bit values.
		int g = a >>> 2; //00000000000000000000000000000001 (g is 1)
		int h = b >>> 2; //00111111111111111111111111111110 (h is 10373741822)
	}

	public static void main(String[] args) {
		compareCorrespondingBits();
	}
}
