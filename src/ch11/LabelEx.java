package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel1 = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("Images/beauty.jpg");
		JLabel imageLabel1 = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("Images/normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel1);
		c.add(imageLabel1);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelEx();

	}

}
