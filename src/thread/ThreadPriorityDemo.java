package thread;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread emailCampaignThread = new Thread(new EmailCampaign());
		Thread dateAggreatorThread = new Thread(new DataAggregator());
		
		emailCampaignThread.setName("EmailCampaign");
		dateAggreatorThread.setName("DataAggregator");
		
		emailCampaignThread.setPriority(Thread.MAX_PRIORITY);
		dateAggreatorThread.setPriority(Thread.MIN_PRIORITY);
		
		emailCampaignThread.start();
		dateAggreatorThread.start();
		
		try {
			dateAggreatorThread.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Inside main ()..........");
	}

}

class EmailCampaign implements Runnable{
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			if(i == 5) {
				Thread.currentThread().yield();
			}
		}
		
	}
	
}
class DataAggregator implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
		
	}
	
}