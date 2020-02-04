package encaplsulation;

public interface Run {
	public void test();
	
	public static void count() {
		System.out.println("this is count()");
	}
	
	public default void display() {
		System.out.println("this is display()");
	}

}
