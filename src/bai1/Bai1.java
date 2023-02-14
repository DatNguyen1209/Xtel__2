package bai1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		
		FileWriter writer;
		BufferedWriter bw;
		try {
			int x = (int) (Math.random()*10);
			writer = new FileWriter("output.txt");
			bw = new BufferedWriter(writer);
			while(1 ==1) {
				bw.write(x);
				System.out.println(x);
				System.out.println("Lưu thành công!!!");
				System.out.println("Nhấp 'stop' để dừng lại");
				String stop = new Scanner(System.in).nextLine();
				if(stop.equals("stop")) {
					
					System.out.println("Chương trình đã dừng lại!!!");
					break;
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

