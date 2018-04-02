/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 6. Your pseudocode algorithm here

loop 10 down to 1 
perform square root 
print result 

*/

public class P5_DescendingSquares {

	public static void main(String[] args) {
			squaresTo10();
		}
		
		public static void squaresTo10() {
			for( int i = 10; i >= 1; i-- ) {
				int square = 0;
				square = square + i * i;
				
				System.out.print( square );
				System.out.print(" ");
			}

		}

}
