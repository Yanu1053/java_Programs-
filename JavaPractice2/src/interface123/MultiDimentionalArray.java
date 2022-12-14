package interface123;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int a[][]= {{2,4,6},{3,7,5}};
		
		for(int i=0;i<2;i++) //outer loop run for rows
		{
			for(int j=0;j<3;j++) //Inner loop run for colomns
			{
				System.out.println(a[i][j]);
				System.out.println("\t");
			}
			System.out.println();
		}

	}

}
