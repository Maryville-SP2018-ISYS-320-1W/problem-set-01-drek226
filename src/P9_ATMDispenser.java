/*
	ISYS 320
	Name(s):Derek Rieger
	Date: 4/1/18
*/

public class P9_ATMDispenser {

	public static void main(String[] args) {

		int dollars;
		int tens;
		int ones;
		
		dollars = 49;
		tens = dollars / 10;
		ones = dollars % 10;
		
		System.out.print("Dispense "+ tens +" $10 bills & "+ ones+" $1 bills.");
	}

}

