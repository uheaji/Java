package ch04;

class Car {
	
	String desc ="�ҳ�Ÿ�� �θ��Դϴ�.";
	
	public Car() {
		System.out.println("�ڵ���");
	}
}

class Sonata extends Car{
	public Sonata() {
		super();
		System.out.println("�ҳ�Ÿ");
		System.out.println(super.desc);
	}
}

public class Super01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sonata();
	}

}
