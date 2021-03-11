package com.oracle.oca11.exam.prep.math;

public class MathimaticalOperations {

	static void math() {
		double a = 1.99, b = 2.99, c = 0;

		c = Math.cos(a); // cosine
		System.out.println("Cosine " + c);
		c = Math.acos(a); // arc cosine
		System.out.println("Arc cosine " + c);
		c = Math.sin(a); // sine
		System.out.println("Sine " + c);
		c = Math.asin(a); // arc sine
		System.out.println("Arc sine " + c);
		c = Math.tan(a); // tangent
		System.out.println("Tangent " + c);
		c = Math.atan(a); // arc tangent
		System.out.println("Arc tangent " + c);
		c = Math.exp(a); // e^a
		System.out.println("e^a " + c);
		c = Math.max(a, b); // greater of two values
		System.out.println("Greatest Number is " + c);
		c = Math.min(a, b); // smaller of two values
		System.out.println("Smaller number is " + c);
		c = Math.pow(a, b); // a^b
		System.out.println("a^b" + c);
		c = Math.sqrt(a); // square root
		System.out.println("Square root of a is " + c);
		c = Math.random(); // random number 0.0>=c<1.0
		System.out.println("Random number " + c);

	}

	static void numericalRounding() {
		int a = 11, b = 3;
		long c = Math.round(a / b); // c is 3
		System.out.println(c);
		double d = Math.round(a / b); // d is 3.0
		System.out.println(d);
		double e = Math.round((double) a / b * 100) / 100.0; // e is 3.67
		System.out.println(e);

		// java math does not assume decimal, to work around this by using powers of
		// 8/10/16 multiply by the same amount as the division. Need to divide by a
		// floating point type to be one.
	}

	public static void main(String[] args) {
		math();
		numericalRounding();
	}

}
