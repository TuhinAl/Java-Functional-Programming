package thread;

public class FirstThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Inside run()...........");
		go();
		
	}
	
	 	
	public void more() {
		System.out.println("Inside more()...........");
	}
	
	public void go() {
		System.out.println("Inside go()...........");
	}
	
	public static void main(String[] args) {
		
		Thread thread = new FirstThread2();
		thread.start();
		System.out.println("Inside main ..........");
	}

}
