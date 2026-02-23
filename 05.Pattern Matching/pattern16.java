
  /*
Pattern-16
A    
AB   
ABC  
ABCD 
ABCDE

Note that for diagonal i = j
for lower triangle i>j(i greater than j for lower)
for upper triangle i<j(i lesser than j for upper)
 */

public class pattern16 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i< row;i++) {
			char ch = 'A';
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

