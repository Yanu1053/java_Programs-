
public class StringPractice {
	
	public void user()
	{
		System.out.println("getData method user data from string class");
	}

	public static void main(String[] args) {
	   
      // Latter Sting -- Create one object and one memory location
		//String a="yana is a QA";
		String b="yana is a QA";	
		
		// this time very time one object is created and memory will allocated
		String x=new String("Yana is a QA");
		String Y=new String("Yana is a QA");
		
		for(int i=0; i<b.length();i++) {
			System.out.println(b.charAt(i));
			
		}
		
		String[] spilltedSprint=b.split("is");
		for(String word1:spilltedSprint) {
			System.out.println(word1.trim());
			
		}
		for(int i=x.length()-1;i>=0;i--) {
			System.out.print(x.charAt(i));
		}
	
		
		
		
		
		
	}

}
	 