package com.oracle.oca11.exam.prep.casting;

public class Casting {
	
	void casting() {
		byte a = 127, b = 5;
		
		//a + b will automatically be converted to an int
		//127 is the max for a byte
		
		int c = a + b;
		
		byte d =  (byte) (a + b); //type overflow, because 127 is max byte value
		
		//no casting required for ++ or -- operators 
		
		char e = 'x';
		
		char f = ++e;
		
		System.out.println(f);
		
		//which ever is bigger take precedent
		
	}

}
