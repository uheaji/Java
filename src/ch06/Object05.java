package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter, toString
@AllArgsConstructor // Ǯ ������
@NoArgsConstructor // ����Ʈ ������
class User2 {
	private int id;
	private String username;
}

public class Object05 {

	public static void main(String[] args) {
		User2 user = new User2(1, "ssar");
		System.out.println(user);

	}

}
