package ch06;

public class Wrapper01 {

	public static void main(String[] args) {
		int num =10;
		Integer num2 = 20;
		
		Object num3 = num2.toString(); // ���ڸ� ���ڷ� �ٲٴ� ��
		System.out.println(num3);
		
		String num4 = num + "";
		
		String num5 = "10";
		int num6 = Integer.parseInt(num5); // String-> int�� ����ȭ
		System.out.println(num6);
		

	}

}
