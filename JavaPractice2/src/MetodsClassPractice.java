
public class MetodsClassPractice {
	
	public void getData()
	{
		System.out.println("getData method data");
	}
	
	public static String myName() {
		return "yana";
	}

	public static void main(String[] args) {
		
		
		MetodsClassPractice a=new MetodsClassPractice();
		a.getData();
		System.out.println(myName());
		StringPractice b=new StringPractice();
		b.user();

	}

}
