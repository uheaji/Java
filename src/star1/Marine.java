package star1;
class Marine {
	// field, property는 private로 만든다. (마법x)
	private String name;
	private int hp;
	private int attack;
	
	// this는 heap을 가르킨다.
	public Marine(String name, int hp, int attack) { // alt + shift + s : 생성자 생성
		this.name = name; // this는 heap변수, new가 된 heap공간을 Binding한다.
		this.hp = hp;  // static에는 this x
		this.attack = attack;
	}
	
	public Marine() {
		
	}
}
