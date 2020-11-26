package ch11;

import java.awt.BorderLayout;
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
	private JLabel imgla = new JLabel(); // �̹����� ��µ� ���̺�
	
	private ImageIcon imgr = new ImageIcon("Images/right.jpg");
	private ImageIcon imgl = new ImageIcon("Images/left.jpg");
	
	public OpenChallenge() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		
		JPanel menuPanel = new JPanel();
		JButton bntl = new JButton(imgl);
		JButton bntr = new JButton(imgr);
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