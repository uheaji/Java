package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch12.Gra02.MyPanel;

public class Gra03 extends JFrame {
	private Container c;
	private MyPanel panel;
	private JButton btn1;

	public Gra03() {
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		panel = new MyPanel();
		btn1 = new JButton("Å¬¸¯");

		c.add(panel, BorderLayout.CENTER);
		c.add(btn1, BorderLayout.SOUTH);

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		setVisible(true);
	}

	class MyPanel extends JPanel {

		private Vector<Point> vc = new Vector<>();
		
		public MyPanel() {

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			for (int i = 0; i < vc.size; i++) {
				
			}
			g.drawLine(20, 0, 20, 100);

		}
	}

	public static void main(String[] args) {
		new Gra03();

	}

}
