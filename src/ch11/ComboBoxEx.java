package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame{
	
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", " berry", "strawberry",
			"blackberry"};
	private String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
	
	
	public ComboBoxEx() {
		setTitle("�޺��ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<>(fruits);
		
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<>();
		for (int i = 0; i < names.length; i++) {
			nameCombo.addItem(names[i]);
		}
		
		c.add(nameCombo);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxEx();
	}

}
