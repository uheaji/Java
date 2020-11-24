package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event03 extends JFrame {
	private Container c;
	private JButton btn1;
	private JLabel la1;

	public Event03() {

		c = getContentPane();
		btn1 = new JButton("��ư");
		la1 = new JLabel("�ȳ�");

		c.add(btn1, BorderLayout.SOUTH);
		c.add(la1, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				la1.setText("�ݰ���");
				
			}
		});

		setTitle("�̺�Ʈ 03");
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Event03();
	}

}
