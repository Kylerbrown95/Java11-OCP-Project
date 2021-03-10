package com.oracle.oca11.exam.prep.arithmetic.operators;

public class AssignmentAndArithmeticOperators {
	
	//Assignments and arithmetics: = + - * / %
	
	int a = 1; //assignment (a is 1)
	int b = a+4; //addition (b is 5)
	int c = b-2; //subtraction ( c is 3)
	int d = c*b; //multiplication (d is 15)
	int e = d/c; //division (e is 5)
	int f = d%6; //modulus (f is 3) this is the remainder so 15/6 = 2.5 as it's an int get rounded up to 3
	
	//Compound assignments are combinations of an operation and an assignment that is action on the same variable.
	//+= -= *= /= %=
	
	public static void main(String[] args) {
		
		compound();
	}
	
	private static void compound() {
	
	int g = 1, h = 3;
	
	System.out.println(g += h); //equivalent of g=g+h (g is 4)
	System.out.println(g -= 2); //equivalent of g=g-2 (g is 2)
	System.out.println(g *= h); //equivalent of g=g*h (g is 6)
	System.out.println(g /= 2); //equivalent of g=g/2 (g is 3)
	System.out.println(g %= g); //equivalent of g=g%g (g is 0)
	
	//Operation evaluation order can be changed by using round brackets.
	//( )
	
	int aaa = 2, bbb = 3;
	int ccc = bbb-aaa*bbb; // (ccc is -3)
	int ddd = (bbb-aaa)*bbb; // (ccc is 3)
	
	System.out.println(ccc);
	System.out.println(ddd);
	
	/*
	 * Increment and decrement operators has prefix and postfix postions:
	 * y=++x x is incremented first and then the result is assigned to y.
	 * y=--x x is decremented first and then the result is assigned to y.
	 * y=x++ y is assigned to the value of x first then x is incremented
	 * y=x-- y is assigned to the value of x first then x is decremented
	 */
	int aa = 1, bb =0;
	
	aa++; //increment (aa is 2)
	++aa; //increment (aa is 3)
	aa--; //decrement (aa is 2)
	--aa; //decrement (aa is 1)
	bb = aa++; //increment postfix (bb is 1, aa is 2)
	bb = ++aa; // increment prefix (bb is 3, aa is 3)
	bb = aa--; // increment postfix (bb is 3, aa is 2)
	bb = --aa; // increment prefix (bb is 1, aa is 1)
	
	//order of which it's done is determined by the prefix or postfix
	
	
	
	}
	
}
