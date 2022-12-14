
public class NestedLoopPractice {
	
	public static void main(String arg[]) {
		
	
		int k=1;
		/*for(int i=0; i<4; i++) {
			
			for(int j=1;j<=4-i;j++) {
				System.out.print(k);
				System.out.print("\t");
				//k++;
			}
			System.out.println();//to print new line
			
			
		}*/
         /*for(int i=1; i<=4; i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				System.out.print("\t");
				//k++;
			}
			System.out.println();//to print new line
			
			
		}*/
		
          for(int i=1; i<4; i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(k*3);
				System.out.print("\t");
				k++;
				
			}
			System.out.println();//to print new line
			
			
		}
		
		
		
		
	}

}
