package ch05;
class Father {
	int money = 10000;
}

class Son extends Father {
	int money = 20000;
}

public class Inherit01 {
	public static void main(String[] args) {
		Father s = new Son();
		// 1��. ������ ã�� �� ������ ������ �� ������ ���
		// ������ ������ �θ� ã�� �ö� ����.
		System.out.println(s.money);
		
		// 2��. new�ϸ� Father�� Son�� heap�� ���.
		// �����ڴ� Son()�� ȣ���� �ȴ�.
		// ����Ű�� �޸� �ּҴ� Ÿ���� ���󰣴�.
		Father f = new Son();
		System.out.println(f.money);
	}
}
