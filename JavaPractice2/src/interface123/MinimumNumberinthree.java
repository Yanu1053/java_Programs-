package interface123;

public class MinimumNumberinthree {

	public static void main(String[] args) {
		
		
		int a[][]= {{2,4,6},{3,7,5},{3,1,9}};
		/*int min=a[0][0];
		int mxm=a[0][0];
		
		//print minimum number in mtrix
		for(int i=0;i<3;i++) //outer loop run for rows
		{
			for(int j=0;j<3;j++) //Inner loop run for colomns
			{
				if(min>a[i][j]) {
					min=a[i][j];
				}
				
			}
			
		}
		System.out.println("minimum value is "+ min);
		
		//Maximum number in matrix
		for(int i=0;i<3;i++) //outer loop run for rows
		{
			for(int j=0;j<3;j++) //Inner loop run for colomns
			{
				if(mxm<a[i][j]) {
					mxm=a[i][j];
				}
				
			}
			
		}
		System.out.println("meximum value is "+ mxm);*/
		
		//find maximum number in minimum colonm 
		int b[][]= {{2,4,6},{3,9,0},{8,7,5}};
		int min=b[0][0];
		int mincolounm = 0;
		//step 1 =minimum number
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				if(min>b[i][j]) {
					min=b[i][j];
					mincolounm=j;
				}
		}
		
              int max= b[0][mincolounm];
              int k=0;
              while(k<3) {
            	  if(b[k][mincolounm]>max) {
            		  max=b[k][mincolounm];
            		  
            	  }
            	  k++;
              }
              System.out.println("maximum "+max);


	}

}
