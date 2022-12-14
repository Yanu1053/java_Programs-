import java.util.ArrayList;

public class IfCondition {
	public static void main (String [] arg) {
		
		int are[]= {1,2,3,4,6,8,9};
		
		//multiples by 2
		for(int num:are) {
			if(num%2==0) {
				System.out.println("multiple 2 "+num);
			}
			else {
				System.out.println("not multiple of 2 "+num);
			}
		}
		ArrayList<String> name=new ArrayList<String>();
		name.add("Yana");
		name.add("maly");
		
		for(String n: name) {
			if(n=="Yana") {
				System.out.println("My Name "+n);
			}
			else {
				System.out.println("Not my Name "+n);
			}
			
		}
	}
	
	

}
