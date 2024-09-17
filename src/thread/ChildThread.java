package thread;

public class ChildThread extends Thread {
	public void run() {
		for (int i=1;i<=6;i++) {
			//Thread.yield();
			try {
				Thread.sleep(1000);
				System.out.println("hii");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("interrupt");
			}
			
		}
	}
	

}
