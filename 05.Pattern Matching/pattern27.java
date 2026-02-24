
    /*
Pattern-27
E    
DE   
CDE  
BCDE 
ABCDE

Note that for diagonal i = j
for lower triangle i>j(i greater than j for lower)
for upper triangle i<j(i lesser than j for upper)
 */

public class pattern27 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i< row;i++) {
			char ch = (char)('E'-i);// important line
			for(int j = 0;j< col;j++) {
				if(i>=j) {
					System.out.print(ch++);
				}
				else {
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}
	}

}
