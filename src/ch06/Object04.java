package ch06;

class User {
	private int id;
	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public User() {
		
	}

	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
}

public class Object04 {
	public static void main(String[] args) {
		User user =  new User(1, "ssar", "1234");
		System.out.println(user); // �ڹٿ��� ���۷����� ȣ���ϸ� toString�� �ڵ���µȴ�.
		
		String s = "�ȳ�";
		System.out.println(s.toString());
	}

}
