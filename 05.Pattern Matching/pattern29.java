        
/*
Pattern-29
5    
45   
345  
2345 
12345

Note that for diagonal i = j
for lower triangle i>j(i greater than j for lower)
for upper triangle i<j(i lesser than j for upper)
 */

public class pattern29 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for(int i = 0;i< row;i++) {
			int num = 5 - i;// important line
			for(int j = 0;j< col;j++) {
				if(i>=j) {
					System.out.print(num++);
				}
				else {
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}
	}

}