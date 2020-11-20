package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// DTO = Data Transfer Object =  Åë½Å¿¡ ¸¹ÀÌ »ç¿ëµÊ.
class UserDto {
	private int id;
	private String name;
}

public class String01 {

	public static void main(String[] args) {
		String data = "id:1,name:È«±æµ¿";
		String[] s = data.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		// ÆÄ½Ì
		UserDto dto =  new UserDto();
		dto.setId(1);
		dto.setName("È«±æµ¿");
		System.out.println(dto);
	}

}
