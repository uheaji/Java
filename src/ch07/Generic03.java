package ch07;

import java.util.Vector;

public class Generic03 {

	public static void main(String[] args) {
		// 동기화 되어있는 임계(위험) 구역 (동시접근 불가능)
		Vector<Integer> list1 = new Vector<>();
		// 사용법 ArrayList와 똑같음
		list1.add(100);
		list1.add(200);
		list1.add(1,300);

	}

}
