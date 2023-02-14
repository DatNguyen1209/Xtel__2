package bai3;

public class Bai3 {

	public static void main(String[] args) {
		BlockingQueue<Integer> blocking = new BlockingQueue<Integer>();
		Producer producer = new Producer(blocking);
		Consumer consumer1 = new Consumer(blocking);
		Consumer consumer2 = new Consumer(blocking);
		Consumer consumer3 = new Consumer(blocking);
		
		new Thread(producer).start();
		new Thread(consumer1).start();
		new Thread(consumer2).start();
		new Thread(consumer3).start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
