package star1;
public class Star1App {
	// 질럿1 -> 드라군1
	static void attack(Zealot u1, Dragoon u2) { // u1, u2는 attack 지역변수
		System.out.println(u1.name + " -> " +  u2.name + " 공격");
		u2.hp = u2.hp -  u1.attack; // 90
		System.out.println(u2.name + " 체력 : " + u2.hp);
	}
	
	// 드라군1 -> 질럿1
	static void attack(Dragoon u1, Zealot u2) { // u1, u2는 attack 지역변수
		System.out.println(u1.name + "->" +  u2.name + "공격");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " 체력 : " + u2.hp);
	}
	
	// 드라군1 -> 드라군2
	static void attack(Dragoon u1, Dragoon u2) { // u1, u2는 attack 지역변수
		System.out.println(u1.name + "->" +  u2.name + "공격");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " 체력 : " + u2.hp);
	}

	// 다크템플러1-> 질럿1 공격
	static void attack(Dark u1, Zealot u2) { // u1, u2는 attack 지역변수
		System.out.println(u1.name + "->" +  u2.name + "공격");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " 체력 : " + u2.hp);
	}
	
	// 다크템플러2-> 드라군1 공격
	static void attack(Dark u1, Dragoon u2) { // u1, u2는 attack 지역변수
		System.out.println(u1.name + "->" +  u2.name + "공격");
		u2.hp = u2.hp -  u1.attack; 
		System.out.println(u2.name + " 체력 : " + u2.hp);
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1", 100, 10); // z1, d1은 main이 들고있는 지역변수
		Dragoon d1 = new Dragoon("드라군1", 100, 20);
		Dragoon d2 = new Dragoon("드라군2", 100, 20);
		Dark da1 = new Dark("다크템플러1", 100, 50);
		Dark da2 = new Dark("다크템플러2", 100, 50);
		
		// 1. 질럿1-> 드라군1 공격
		attack(z1,d1);
		
		// 2. 드라군1-> 질럿1 공격
		attack(d1,z1);
		
		// 3. 드라군1-> 드라군2 공격
		attack(d1,d2);
		
		// 4. 다크템플러1-> 질럿1 공격 (다크템플러1, 100, 50)
		attack(da1,z1);
		
		// 5. 다크템플러2-> 드라군1 공격
		attack(da2,d1);
	}
}
