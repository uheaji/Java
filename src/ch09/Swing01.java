package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing�� ���������� While�� ���� ����. ���� ���μ���
public class Swing01 extends JFrame{
	
	public Swing01() {
		setTitle("����");
		setSize(300, 500);
		
		// JPanel = (JFrame�� �⺻������ ������ �ִ� �г�)
		Container c = getContentPane(); 
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		
		JPanel jp1 = new JPanel();
		jp1.add(btn6);
		
		c.add(btn1, MyLayout.WEST.getValue());
		c.add(btn2, Batch.EAST);
		c.add(jp1, Batch.CENTER);
		c.add(btn4, Batch.NORTH);
		c.add(btn5, BorderLayout.SOUTH);
		
		
		setVisible(true); // ȭ�鿡 ǥ���ϴ� �Լ�
	}

	public static void main(String[] args) {
		System.out.println(MyLayout.WEST);
		System.out.println(MyLayout.WEST.name());
		System.out.println(MyLayout.WEST.ordinal());
		System.out.println(MyLayout.WEST.getValue());
		new Swing01();

	}

}
