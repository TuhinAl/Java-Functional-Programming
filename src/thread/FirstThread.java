package thread;

public class FirstThread {
	public static void main(String[] args) {
		// create thread
		// create task
		// put task into thread
		
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("Inside main ..........");
	}

}
class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run()...........");
		go();
		
	}
	
	public void go() {
		System.out.println("Inside go()...........");
		more();
	}
	 	
	public void more() {
		System.out.println("Inside more()...........");
	}
	
}