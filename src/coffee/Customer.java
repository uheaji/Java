package coffee;

// ��
// å�� : �ֹ�()
public class Customer {
	
	public void order(Barista b1) {
		// �ٸ���Ÿ���� �޽����� ����(�Լ� ȣ��)
		Coffee c = b1.makeCoffee();
		System.out.println(c.getName() + "�� ���Խ��ϴ�.");
	}
	
	
}
