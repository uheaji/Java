package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// DTO = Data Transfer Object =  ��ſ� ���� ����.
class UserDto {
	private int id;
	private String name;
}

public class String01 {

	public static void main(String[] args) {
		String data = "id:1,name:ȫ�浿";
		String[] s = data.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		// �Ľ�
		UserDto dto =  new UserDto();
		dto.setId(1);
		dto.setName("ȫ�浿");
		System.out.println(dto);
	}

}
