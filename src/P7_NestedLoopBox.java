/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 4. Your pseudocode algorithm here

loop 6 lines
print 6 star on each line 

*/
public class P7_NestedLoopBox {

	
	public static void main(String[] args) {
		for(int lines = 6; lines >= 1; lines--) {
			for(int stars = 6; stars >= 1; stars--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
