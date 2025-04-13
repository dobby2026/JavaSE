package section05_loop;
/*

1번 - 분석하기
*
**
***
****
*****
******
*******



2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
		
   *   		
  ***		
 *****		
*******		
 *****		
  ***		
   *		
 




 */

public class LoopHomeWork01 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			
			for(int j = 0; j < i+1; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}

}
