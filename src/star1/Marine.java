package star1;
class Marine {
	// field, property�� private�� �����. (����x)
	private String name;
	private int hp;
	private int attack;
	
	// this�� heap�� ����Ų��.
	public Marine(String name, int hp, int attack) { // alt + shift + s : ������ ����
		this.name = name; // this�� heap����, new�� �� heap������ Binding�Ѵ�.
		this.hp = hp;  // static���� this x
		this.attack = attack;
	}
	
	public Marine() {
		
	}
}
