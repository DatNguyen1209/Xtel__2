package bai3;

import java.util.LinkedList;

public class BlockingQueue<T> {

	private static final int comtacity = 10;
	private final LinkedList<T> items = new LinkedList<>();
	public synchronized void put(T value) {
		while(items.size()== comtacity){
			System.out.println("Full");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		items.add(value);
		notify();
	}
	public  synchronized T take() {
		while(items.size() == 0) {
			System.out.println("Empty");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notify();
		
		return items.removeFirst();
		
	}
	public synchronized int size() {
		return items.size();
	}
}
