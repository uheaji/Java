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
class RespDto<T> { // <T>는 new할때 리턴타입결정ㅇ, class옆에다 씀.
	private int code; // 200(정상), 400(실패)
	private T data;
}

public class Generic04 {
	
	static RespDto<?> getData(String username) { // <?> 함수를 호출할 때 리턴타입 결정
		if (username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("아이디가 틀렸습니다."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}
