package thread;

public class DaughterThreadcall {
	public static void main(String[] args) {
		DaughterThread dt =  new DaughterThread();
		dt.setPriority(10);
		dt.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("iam here");
		}
	}

}
