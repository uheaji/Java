package star1;

// 1. Zealot, Dragoon, Tank, Scv, Dark => StarUnit Ÿ��
public class Star3App {
	static void attack(StarUnit u1, StarUnit u2) {
		u2.setHp(u2.getHP()-u1.getAttack());
		System.out.println(u2.getName() + " ü�� : " + u2.getHP());
	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10);
		Zealot z2 = new Zealot("����2", 100, 10);
		Dragoon d1 = new Dragoon("���1", 100, 20);
		Dark dt1 = new Dark("��ũ���÷�1", 100, 50);
		
		attack(z1,z2);
		attack(z2,dt1);
		attack(d1,z1);


	}

}
