package ch03;

public class For01 {
	public static void main(String[] args) {
		// �ݺ��� -> ������ �ݺ��Ǵ� ��
		// �ʱⰪ�� i =1 (for�� ���� �� �ѹ���  ȣ���)
		// ���ǽ��� i�� 5���� ���� ������ �ݺ��ϰ�
		// ������ �ѹ� ����� ������ i�� 1�� ����
		
		// ù��° ������ �ʱⰪ ���� �� ���� Ȯ��
		// �ι�° �������ʹ� i�� ���� �� ���� Ȯ�� (�ݺ�)
		for(int i =1; i<5; i++) {
			System.out.println("���� : "+i);
		}
		
		System.out.println();
		
		for (int i = 4; i >= 1; i--) {
			System.out.println("���� : "+i);
		}
		
		System.out.println();
		
		for (int i = 1; i <= 100; i=i+2) {
			System.out.println("���� : "+i);
		}
		
		System.out.println();
		
		// 0���� 100������ �� �߿��� 3�� ����� ����Ͻÿ�.
		for (int i = 3; i <=100; i=i+3) {
			System.out.println("3�ǹ�� : "+i);
		}
		
		
	}
}
