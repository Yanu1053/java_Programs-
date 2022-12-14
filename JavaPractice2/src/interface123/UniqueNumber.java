package interface123;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		
		//unique number in the array
		//repeat numbers repeat count
		
		int a[]= {3,4,5,3,5,4,2,9,7,3,2};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i=0;i<a.length;i++) {
			int k=0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]);
					k++;
				}
				
			}System.out.println(a[i]);
			System.out.println(k);
			if(k==1) {
				System.out.println(a[i] + "unique value");
			}
			
		}

	}

}
