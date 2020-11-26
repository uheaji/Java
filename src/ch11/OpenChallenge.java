package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame{
	
	private ImageIcon [] img1 = {
			new ImageIcon("Images/image0.jpg"),
			new ImageIcon("Images/image1.jpg"),
			new ImageIcon("Images/image2.jpg"),
			new ImageIcon("Images/image4.jpg"),
	};
	private JLabel imgla = new JLabel(); // 이미지가 출력될 레이블
	
	public OpenChallenge() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Color.gray);
		JButton bntl = new JButton(new ImageIcon("Images/left.png"));
		JButton bntr = new JButton(new ImageIcon("Images/right.png"));
		menuPanel .add(bntl);
		menuPanel .add(bntr);
		
		c.add(imgla, BorderLayout.CENTER);
		c.add(menuPanel , BorderLayout.SOUTH);
		
		setSize(300, 500);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new OpenChallenge();

	}

}
