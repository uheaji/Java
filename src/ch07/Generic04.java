package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Error {
	private String msg;
}

@Data
@AllArgsConstructor
class User {
	private int id;
	private String username;
}

@Data
@AllArgsConstructor
class RespDto<T> { // <T>�� new�Ҷ� ����Ÿ�԰�����, class������ ��.
	private int code; // 200(����), 400(����)
	private T data;
}

public class Generic04 {
	
	static RespDto<?> getData(String username) { // <?> �Լ��� ȣ���� �� ����Ÿ�� ����
		if (username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("���̵� Ʋ�Ƚ��ϴ�."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}
