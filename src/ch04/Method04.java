package ch04;

//ctrl+shift+f ����
// �޼���ȿ� �޼��带 ������ �� ����.
// ������ �޼���(�Լ�)�� ���� �� ����.
public class Method04 {

	int money = 10000; // heap

	int add(int num) { // int num -> stack, add() ->heap
		int money2 = money + num;
		return money2; // �����ϰ� ���� return���ش�.
	}

	public static void main(String[] args) {
		Method04 m = new Method04();
		int money2 = m.add(50000);
		System.out.println(money2);
		System.out.println(m.money);
	}
}
