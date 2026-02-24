         
/*
Pattern-28
1    
21   
321  
4321 
54321

Note that for diagonal i = j
for lower triangle i>j(i greater than j for lower)
for upper triangle i<j(i lesser than j for upper)
 */

public class pattern28 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i< row;i++) {
			int num = 1 + i;// important line
			for(int j = 0;j< col;j++) {
				if(i>=j) {
					System.out.print(num--);
				}
				else {
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}
	}

}

