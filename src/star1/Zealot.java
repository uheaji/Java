package star1;

class Zealot extends StarUnit {
	private String name; // heap
	private int hp;
	private int attack;
	
	public Zealot() {
		
	}
	
	// ��Ģ :  Ŭ������ �����ϸ� ������ �ʱ�ȭ�� ���� �����ڸ� �����. -> ctrl + space
	

	public String getName() {
		return name;
	}

	public Zealot(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}
