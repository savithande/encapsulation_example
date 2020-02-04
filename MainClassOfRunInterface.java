package encaplsulation;

public class MainClassOfRunInterface {
	
	public static void main(String[] args) {
		SampleImplementationOfRunInterface sample = new SampleImplementationOfRunInterface();
		
		sample.display();
		sample.test();
		
		Run.count();
	}

}
