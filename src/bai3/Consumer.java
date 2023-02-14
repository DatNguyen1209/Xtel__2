package bai3;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable{

	private final BlockingQueue<Integer> blocking;
	
	public Consumer(BlockingQueue<Integer> blocking) {
		super();
		this.blocking = blocking;
	}

	@Override
	public void run() {
		while(true) {
			blocking.take();
			System.out.println("X"+ blocking.size());
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(50,300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
