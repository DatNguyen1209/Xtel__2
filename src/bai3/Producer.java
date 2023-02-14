package bai3;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable{

	private final BlockingQueue<Integer> bloking;
	
	public Producer(BlockingQueue<Integer> bloking) {
		super();
		this.bloking = bloking;
	}

	
	@Override
	public void run() {
		try {
			while(true) {
				bloking.put(produce());
				System.out.println("Xtel"+ bloking.size());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	private Integer produce() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ThreadLocalRandom.current().nextInt(1,50);
	}

	
}
