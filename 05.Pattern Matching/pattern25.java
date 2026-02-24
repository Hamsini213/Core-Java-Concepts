
   /*
Pattern-25
1    
23   
456  
7891 
23456

Note that for diagonal i = j
for lower triangle i>j(i greater than j for lower)
for upper triangle i<j(i lesser than j for upper)
 */

public class pattern25 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 1;
		for(int i = 0;i< row;i++) {
			for(int j = 0;j< col;j++) {
				
				if(i>=j) {
					System.out.print(num++);
					if(num == 10) {
						num = 1;
					}
				}
				else {
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}
	}

}
 

