package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}
}

public class RunnableTimerEX extends JFrame {
	public RunnableTimerEX() {
		setTitle("Runnable을 구현한 타이머 스레드 에제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
//		TimerRunnable runnable = new TimerRunnable(timerLabel);
//		Thread t1 = new Thread(runnable);
		Thread t1 = new Thread(new TimerRunnable(timerLabel));
		
		setSize(250, 150);
		setVisible(true);
		
		t1.start();
	}
	
	
	public static void main(String[] args) {
		new RunnableTimerEX();

	}

}
