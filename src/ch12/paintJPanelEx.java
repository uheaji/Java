package ch12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame {

	private MyPanel panel = new MyPanel();
	
	public paintJPanelEx() {
		setTitle("JPanel의 paintComponent()예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 패널 내의 이전의 그려진 잔상을 지우기 위해 호출.
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new paintJPanelEx();
	}

}
