package star1;
public class Star1App {
	// ����1 -> ���1
	static void attack(Zealot u1, Dragoon u2) { // u1, u2�� attack ��������
		System.out.println(u1.name + " -> " +  u2.name + " ����");
		u2.hp = u2.hp -  u1.attack; // 90
		System.out.println(u2.name + " ü�� : " + u2.hp);
	}
	
	// ���1 -> ����1
	static void attack(Dragoon u1, Zealot u2) { // u1, u2�� attack ��������
		System.out.println(u1.name + "->" +  u2.name + "����");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " ü�� : " + u2.hp);
	}
	
	// ���1 -> ���2
	static void attack(Dragoon u1, Dragoon u2) { // u1, u2�� attack ��������
		System.out.println(u1.name + "->" +  u2.name + "����");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " ü�� : " + u2.hp);
	}

	// ��ũ���÷�1-> ����1 ����
	static void attack(Dark u1, Zealot u2) { // u1, u2�� attack ��������
		System.out.println(u1.name + "->" +  u2.name + "����");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " ü�� : " + u2.hp);
	}
	
	// ��ũ���÷�2-> ���1 ����
	static void attack(Dark u1, Dragoon u2) { // u1, u2�� attack ��������
		System.out.println(u1.name + "->" +  u2.name + "����");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " ü�� : " + u2.hp);
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10); // z1, d1�� main�� ����ִ� ��������
		Dragoon d1 = new Dragoon("���1", 100, 20);
		Dragoon d2 = new Dragoon("���2", 100, 20);
		Dark da1 = new Dark("��ũ���÷�1", 100, 50);
		Dark da2 = new Dark("��ũ���÷�2", 100, 50);
		
		// 1. ����1-> ���1 ����
		attack(z1,d1);
		
		// 2. ���1-> ����1 ����
		attack(d1,z1);
		
		// 3. ���1-> ���2 ����
		attack(d1,d2);
		
		// 4. ��ũ���÷�1-> ����1 ���� (��ũ���÷�1, 100, 50)
		attack(da1,z1);
		
		// 5. ��ũ���÷�2-> ���1 ����
		attack(da2,d1);
	}
}
