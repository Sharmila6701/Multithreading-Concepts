package thread;

public class Threadcall {
	public static void main(String[] args) throws InterruptedException {
		ChildThread ct = new ChildThread();
		//System.out.println(ct.getState());//getState() refering a thread states like new,runnable..
//		System.out.println(ct.getName());
//		ct.setName("sharmi");
//		System.out.println(ct.getName());
		ct.start();//na run();cl pana single thread means sequence ah run agum (child thread loop mudinchano main thread loop mudiyum);suppose start();cl pana parallel run agum at a same time
		//ct.join();
		ct.interrupt();
		for(int i=1;i<=10;i++) {
			
			System.out.println("*");
		}
	}

}
