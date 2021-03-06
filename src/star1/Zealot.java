package star1;

class Zealot extends StarUnit {
	private String name; // heap
	private int hp;
	private int attack;
	
	public Zealot() {
		
	}
	
	// 규칙 :  클래스를 생성하면 무조건 초기화를 위한 생성자를 만든다. -> ctrl + space
	

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
