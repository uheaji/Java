package ch10;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");

	public MouseAdapterEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			
		}
	}
	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
