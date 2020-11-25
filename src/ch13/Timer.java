package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Timer extends JFrame {
	public Timer() {
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class TimeLabel extends JLabel implements Runnable{
		private Thread TimerThread;
		
		@Override
		public void run() {
			
			
		}
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now.getHour());
//		System.out.println(now.getMinute());
//		System.out.println(now.getSecond());	
	}

	public static void main(String[] args) {
		new Timer();
		

	}
}
