package bai2;

public class MyThread extends Thread {

	@Override
	public void run() {
//		int i = (int) (Math.random()*10);
		for (int j = 0; j < 30; j++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((int)(Math.random()*10));
			
		}
	}
}
