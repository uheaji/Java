package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	private JLabel timeLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timeLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		while (true) {
			timeLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch ( InterruptedException e) {
				return;
			}
			
		}
	}
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread t1 = new TimerThread(timerLabel);
		
		setSize(300,170);
		setVisible(true);
		
		t1.start();
	}
	
	
	public static void main(String[] args) {
		new ThreadTimerEx();

	}

}
