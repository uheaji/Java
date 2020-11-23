package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example04 extends JFrame{
	
	public Example04() {
		setTitle("Ten Color Buttons Frame");
		
		GridLayout grid = new GridLayout(1, 10);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.red);
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.orange);
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.yellow);
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.green);
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.blue);
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.CYAN);
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.MAGENTA);
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.gray);
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.pink);
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.lightGray);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(btn0);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		c.add(btn7);
		c.add(btn8);
		c.add(btn9);
		
		setSize(600, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Example04();

	}

}
