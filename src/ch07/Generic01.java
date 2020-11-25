package ch07;

import lombok.Data;

@Data
class ResponseDto<K>{
	private int statusCode; // 200(����), 300(�ٽÿ�û��), 400(�߸��ȿ�û)
	private K data; // K�� ���� �������� ���� Ÿ��
}


public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<String> dto = new ResponseDto(); // <> �ȿ� int x, Integer o
		dto.setStatusCode(200);
		dto.setData("���");
		
		System.out.println(dto.getStatusCode());
		
		if (dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}
		
	}
}
