package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);

		Container c = getContentPane();

		JPanel jp1 = new JPanel();
		jp1.setLayout(grid);
		jp1.add(new JLabel("이름"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 학번"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 학과"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 과목"));
		jp1.add(new JTextField(""));

		JButton btn1 = new JButton("버튼1");

		c.add(jp1, BorderLayout.CENTER);
		c.add(btn1, BorderLayout.SOUTH);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();

	}

}
