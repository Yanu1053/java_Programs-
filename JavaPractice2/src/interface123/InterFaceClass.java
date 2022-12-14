package interface123;

public class InterFaceClass implements InteterfacePractice {

	public static void main(String[] args) {
		
		InteterfacePractice ic =new InterFaceClass();
		ic.greengo();
		ic.redStop(); 

	}

	
	public void greengo() {
		
		System.out.println("Green is ready to go");
	}

	
	public void redStop() {
		
		System.out.println("red is stop");
		
	}
	
	

}
