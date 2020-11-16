package ch04;

class TV {
	private String name;
	private int age;
	private int size;

	public TV() {

	}

	public TV(String name, int age, int size) {
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	void show() {
		System.out.println( name +"에서 만든 " + age  +"형 " + size  + "인치 TV");
	}
}

public class Example1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();

	}

}
