package thread;

public class Calling {
public static void main(String[] args) {
	Threadprioritydemo tp = new Threadprioritydemo();
	Threadprioritydemo tp2= new Threadprioritydemo();
	Threadprioritydemo tp3 = new Threadprioritydemo();
	Threadprioritydemo tp4 = new Threadprioritydemo();

//	tp.dis();
//	tp.test();
	tp.start();
	tp2.start();
}
}
