package ch05;
class Father {
	int money = 10000;
}

class Son extends Father {
	int money = 20000;
}

public class Inherit01 {
	public static void main(String[] args) {
		Father s = new Son();
		// 1번. 변수를 찾을 때 변수가 있으면 그 변수를 사용
		// 변수가 없으면 부모를 찾아 올라 간다.
		System.out.println(s.money);
		
		// 2번. new하면 Father과 Son이 heap에 뜬다.
		// 생성자는 Son()만 호출이 된다.
		// 가르키는 메모리 주소는 타입을 따라간다.
		Father f = new Son();
		System.out.println(f.money);
	}
}
