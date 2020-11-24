package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class LoginScreen extends JFrame {
	// Context = ���ؽ�Ʈ = ����Ŀ
	private LoginScreen loginScreen = this;
	private JTextField tfUsername;
	private JButton btnLogin;
	
	public LoginScreen() {
		tfUsername = new JTextField("");
		btnLogin = new JButton("�α���");
		
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		
		Container c = getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);
		
		initListener();
		
		setVisible(true);
	}
	
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				if (username.equals("ssar")) {
					new HomeScreen(loginScreen);
					loginScreen.setVisible(false);
				}else {
					System.out.println("�α��� ���� : ���̵� �ٽ� �Է��ϼ���.");
				}
						
				
			}
		});
	}

	public LoginScreen getLoginScreen() {
		return loginScreen;
	}

	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}

	public JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	
}
