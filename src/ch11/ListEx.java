package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {
	private String[] fruits = { "apple", "banana", " kiwi", "mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private ImageIcon[] images = { new ImageIcon("Images/icon1.png"), new ImageIcon("Images/icon2.png"),
			new ImageIcon("Images/icon3.png"), new ImageIcon("Images/icon4.png") };

	public ListEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> starList = new JList<>(fruits);
		c.add(starList);
		
		JList<ImageIcon> imageList = new JList<>(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListEx();
	}

}
