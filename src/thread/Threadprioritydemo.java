package thread;

public class Threadprioritydemo extends Thread {
	    public void test() {
	    	for (int i=1;i<=5;i++) {
				System.out.println("t");
			}
	    }
	    public void dis() {

			for (int j=1;j<=5;j++) {
				System.out.println("t2");
			}
	    }
	public void run() {
		test();
		dis();
	}
	

	

}
