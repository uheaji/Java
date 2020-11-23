package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;

public class Swing04 extends JFrame {

	private JPanel panel1, panel2;
	private JButton btn1, btn2, btn3;
	private JLabel la1, la2, la3;

	public Swing04() {

		// 1. 필요한 오브젝트를 메모리에 로딩
		initObject();

		// 2. 세팅
		initSetting();

		// 3. 배치
		initBatch();

	}

	void initObject() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		btn1 = new JButton("Open");
		btn2 = new JButton("Read");
		btn3 = new JButton("Close");
		la1 = new JLabel("Hello");
		la2 = new JLabel("Java");
		la3 = new JLabel("Love");
	}

	void initSetting() {
		setTitle("Open Challenge 9");
		setSize(400, 400);
		setVisible(true);

		panel1.setBackground(Color.LIGHT_GRAY);

	}

	void initBatch() {
		getContentPane().add(panel1, BorderLayout.NORTH);
		getContentPane().add(panel2, BorderLayout.CENTER);
		panel2.setLayout(null);

		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);

		la1.setBounds(130, 25, 57, 15);
		panel2.add(la1);
		la2.setBounds(58, 143, 57, 15);
		panel2.add(la2);
		la3.setBounds(281, 97, 57, 15);
		panel2.add(la3);

	}

	public static void main(String[] args) {
		new Swing04();
	}
}
