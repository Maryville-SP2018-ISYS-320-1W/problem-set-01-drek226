/*
  	ISYS 320
  	Name(s):Derek Rieger
  	Date: 4/1/18
*/

public class P4_Position {

	public static void main(String[] args) {

		double s0;
		double v0;
		double a; 
		double t; 
		double t2;
		double s;
		
		s0 = 15;
		v0 = 18;
		t = 45;
		a = 5;
		t2 = t * t;
		s = s0 + v0 * t + (.5 * (a * t2));
		
		System.out.print("s = ");
		System.out.print(s);
	}

}
