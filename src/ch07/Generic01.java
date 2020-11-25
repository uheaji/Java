package ch07;

import lombok.Data;

@Data
class ResponseDto<K>{
	private int statusCode; // 200(성공), 300(다시요청해), 400(잘못된요청)
	private K data; // K는 아직 정해지지 않은 타입
}


public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<String> dto = new ResponseDto(); // <> 안에 int x, Integer o
		dto.setStatusCode(200);
		dto.setData("사과");
		
		System.out.println(dto.getStatusCode());
		
		if (dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}
		
	}
}
